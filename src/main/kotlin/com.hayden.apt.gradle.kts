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