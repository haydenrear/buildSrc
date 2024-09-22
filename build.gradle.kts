plugins {
    `kotlin-dsl`
    `java-library`
}

dependencies {
    implementation("com.hayden:hayden-bom-plugin:0.0.1")
    implementation(vC.netflixDgsLib)
    implementation(vC.springBoot)
    implementation(vC.springDependencyManagement)
    implementation(vC.kotlinGradle)
    implementation("com.bmuschko.docker-remote-api:com.bmuschko.docker-remote-api.gradle.plugin:9.0.1")
}

repositories {
    gradlePluginPortal()
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://repo.spring.io/milestone")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}
