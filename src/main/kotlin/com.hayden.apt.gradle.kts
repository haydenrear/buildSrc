import gradle.kotlin.dsl.accessors._11382ea7e5575ad54334ac54f7fb357b.bootJar
import gradle.kotlin.dsl.accessors._11382ea7e5575ad54334ac54f7fb357b.compileTestJava

plugins {
    `java-library`
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    enabled = true
}

tasks.bootJar {
    enabled = false
}

tasks.compileTestJava {
    enabled = false
}