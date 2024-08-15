//import gradle.kotlin.dsl.accessors._11382ea7e5575ad54334ac54f7fb357b.bootJar
//import gradle.kotlin.dsl.accessors._11382ea7e5575ad54334ac54f7fb357b.compileTestJava

val catalogs = extensions.getByType<VersionCatalogsExtension>()



plugins {
    `java-library`
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    enabled = true
}

tasks.compileTestJava {
    enabled = false
}