plugins {
    `java-library`
    `maven-publish`
}

val testsJar by tasks.registering(Jar::class) {
    archiveClassifier.set("tests")
    from(sourceSets["test"].output)
}

val testJars by configurations.creating {
    isCanBeConsumed = true
    isCanBeResolved = false
    // If you want this configuration to share the same dependencies, otherwise omit this line
    extendsFrom(configurations["implementation"])
}

artifacts {
    add("testJars", testsJar)
}

//(publishing.publications["maven"] as MavenPublication).artifact(testsJar)
