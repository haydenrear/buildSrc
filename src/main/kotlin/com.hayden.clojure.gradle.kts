plugins {
    id("dev.clojurephant.clojure")
}

dependencies {
    implementation("org.clojure:clojure:1.11.1")
    testRuntimeOnly("org.ajoberstar:jovial:0.3.0")
    devImplementation("org.clojure:tools.namespace:1.3.0")
}

tasks.named<Jar>("jar") {
    from(buildDir.resolve("clojure/main")) {
        include("**/*.class")
    }
}


sourceSets {
    main {
        clojure {
            srcDir("src/main/clojure")
        }
    }
    test {
        clojure {
            srcDirs("src/test/clojure")
        }
    }
}
