plugins {
    `kotlin-dsl`
    `java-library`
}

project.ext["springCloudVersion"] = "2023.0.0"
project.ext["springBootVersion"] = "3.2.5"

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:${property("springBootVersion")}")
    implementation("io.spring.gradle:dependency-management-plugin:1.1.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
    implementation("com.netflix.graphql.dgs.codegen:graphql-dgs-codegen-gradle:6.0.3")
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

