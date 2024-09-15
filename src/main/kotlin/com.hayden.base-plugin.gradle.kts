import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector
import gradle.kotlin.dsl.accessors._a018eb63154f77c0b168d3d04658f072.dependencyManagement

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

