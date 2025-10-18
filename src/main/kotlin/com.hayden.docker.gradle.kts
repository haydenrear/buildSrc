import com.bmuschko.gradle.docker.tasks.image.DockerBuildImage
import com.bmuschko.gradle.docker.tasks.image.DockerPushImage
import org.springframework.boot.gradle.tasks.bundling.BootJar

plugins {
    id("com.bmuschko.docker-remote-api")
    id("com.hayden.no-main-class")
}


val enableDocker = project.property("enable-docker")?.toString()?.toBoolean()?.or(false) ?: false

data class DockerContext(val imageName: String, val contextDir: String, val taskPrefix: String)

extensions.create<WrapDockerArgs>("wrapDocker")

interface WrapDockerArgs {
    val ctx: Property<Array<DockerContext>>
}

val dockerContexts = extensions.getByType(WrapDockerArgs::class.java).ctx



if (enableDocker) {
    docker {
        uri("unix:///var/run/docker.sock")
        registryCredentials {
            url = "https://index.docker.io/v1/"
        }
        registryCredentials {
            url = "http://localhost:5005"
        }
    }
}


tasks.register<Copy>("copyJar") {
    dependsOn("bootJar")
    println("copying: " + projectDir.path)
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
    from(file(layout.buildDirectory).resolve("libs"))
    into(file(layout.projectDirectory).resolve("src/main/docker"))
    val jar = tasks.getByName("bootJar", BootJar::class).archiveFileName
        .get()
    println("Copying: " + jar)
    include(jar)
}

if (enableDocker)
    afterEvaluate {
        val dockerTasks = dockerContexts.map { it ->
                val inContexts = it.map {

                    val createImage = "${it.taskPrefix}DockerImage"
                    tasks.register<DockerBuildImage>(createImage) {
                        dependsOn("copyJar")
                        inputs.dir(it.contextDir)
                        inputDir = file(it.contextDir)
                        images.add(it.imageName)
                        logging.captureStandardOutput(LogLevel.DEBUG)
                    }

                    it.imageName
                }

                val pushImageDeps = it.map { "${it.taskPrefix}DockerImage" }.toMutableList()

                pushImageDeps.addFirst("copyJar")

                if (inContexts.size != 0) {
                    tasks.register<DockerPushImage>("pushImages") {
                        dependsOn("copyJar")
                        images.addAll(inContexts)
                    }
                }

                val nextImage = it.map { "${it.taskPrefix}DockerImage" }
                    .toMutableList();

                nextImage.add("pushImages")

//                tasks.withType<JavaCompile> {
//                    dependsOn(nextImage)
//                }

                it
            }
            .getOrElse(emptyArray())

        println("See some docker tasks: $dockerTasks")
    }
