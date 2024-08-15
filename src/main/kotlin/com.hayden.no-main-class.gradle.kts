plugins {
    id("com.hayden.spring")
    id("com.hayden.base-plugin")
}

tasks.bootJar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    enabled = false
}

tasks.jar {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    enabled = true
}


