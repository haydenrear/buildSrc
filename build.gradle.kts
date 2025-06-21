plugins {
    `kotlin-dsl`
    `java-library`
}

dependencies {
    implementation("com.hayden:hayden-bom-plugin:0.0.4")
    implementation("org.ndrwdn.mbgradle:mountebank:0.0.8")
    implementation(vC.netflixDgsLib)
    implementation(vC.springBoot)
    implementation(vC.springDependencyManagement)
    implementation(vC.kotlinGradle)
    implementation("com.bmuschko.docker-remote-api:com.bmuschko.docker-remote-api.gradle.plugin:9.0.1")
    implementation("dev.clojurephant.clojure:dev.clojurephant.clojure.gradle.plugin:0.8.0-beta.7")
}

repositories {
    gradlePluginPortal()
    maven {
        url = uri("https://repo.clojars.org")
    }
    maven {
        url = uri("https://jitpack.io")
    }
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://repo.spring.io/milestone")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

