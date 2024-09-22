import com.bmuschko.gradle.docker.tasks.image.DockerBuildImage
import com.bmuschko.gradle.docker.tasks.image.DockerPushImage

plugins {
    id("com.bmuschko.docker-remote-api")
    id("com.hayden.no-main-class")
}

docker {
    uri("unix:///var/run/docker.sock")
    registryCredentials {
        url = "https://index.docker.io/v1/"
    }
    registryCredentials {
        url = "http://localhost:5001"
    }

}

data class DockerContext(val imageName: String, val contextDir: String, val taskPrefix: String) {
}

extensions.create<WrapDockerArgs>("wrapDocker");

interface WrapDockerArgs {
    val ctx: Property<Array<DockerContext>>
}


val ctxs = extensions.getByType(WrapDockerArgs::class.java).ctx;

afterEvaluate {
    val c = ctxs.map { it ->

        println("Adding Docker tasks.")

        val createTasks = mutableListOf<String>();

        val inContexts = it.map {

            val createImage = "${it.taskPrefix}DockerImage"
            tasks.register<DockerBuildImage>(createImage) {
                inputDir.set(file(it.contextDir))
                images.add(it.imageName)
                logging.captureStandardOutput(LogLevel.DEBUG)
            }

            it.imageName
        }


        tasks.register<DockerPushImage>("pushImages") {
            images.addAll(inContexts)
        }

        val c = it.map { "${it.taskPrefix}DockerImage" }.toMutableList();
        c.add("pushImages");

        tasks.withType<JavaCompile>() {
            dependsOn(c)
        }

        it
    }.getOrElse(emptyArray())


    println("Found: " + c)
}
