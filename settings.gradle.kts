dependencyResolutionManagement {
    versionCatalogs {
        repositories {
            mavenLocal()
        }
        create("vC") {
            from("com.hayden:hayden-catalog:0.0.2")
        }
    }
    repositories {
        mavenLocal()
    }
}

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}
