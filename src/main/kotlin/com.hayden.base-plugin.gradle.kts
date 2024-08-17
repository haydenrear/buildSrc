plugins {
    `java-library`
    `maven-publish`
    id("com.hayden.bom-plugin")
}


java {
    version = 21
}

repositories {
    mavenLocal()
    mavenCentral()

    maven {
        url = uri("https://repo.spring.io/milestone")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }

}

tasks.withType<Test> {
    useJUnitPlatform()
}

group = "com.hayden"
version = "1.0.0"

