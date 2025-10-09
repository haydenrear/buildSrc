tasks.register("processYmlFiles") {
    group = "custom"
    description = "Processes server.json and replaces environment variables"
    dependsOn("processResources", "processTestResources")

    fun doFile(value: String, buildDir: String) {
        file(layout.projectDirectory).resolve(value)
            .listFiles { it -> it.name.endsWith(".yml") }
            ?.forEach {
                println("Processing ${it.name}")
                val inputPath = it
                val outputPath = file(layout.buildDirectory).resolve("${buildDir}/${inputPath.name}")

                if (!inputPath.exists()) {
                    throw GradleException("File not found: ${inputPath.absolutePath}")
                }

                var originalContent = inputPath.readText()
                originalContent = originalContent.replace("{{PROJ_DIR}}", layout.projectDirectory.toString())
                originalContent = originalContent.replace("{{PARENT_DIR}}", file(layout.projectDirectory).parent.toString())
                originalContent = originalContent.replace("{{BUILD_DIR}}", file(layout.buildDirectory).toString())

                outputPath.parentFile.mkdirs()
                outputPath.writeText(originalContent)
                println("Processed file written to: ${outputPath.absolutePath}")

            }
    }
    doLast {
        doFile("src/main/resources", "resources/main")
        doFile("src/test/resources", "resources/test")
    }
}

tasks.register("processMcpServerJson") {
    group = "custom"
    description = "Processes server.json and replaces environment variables"
    dependsOn("processResources", "processTestResources")

    fun doFile(value: String, buildDir: String) {
        file(layout.projectDirectory).resolve(value)
            .listFiles { it -> it.name.endsWith(".json") }
            ?.forEach {
                println("Processing ${it.name}")
                val inputPath = it
                val outputPath = file(layout.buildDirectory).resolve("${buildDir}/${inputPath.name}")

                if (!inputPath.exists()) {
                    throw GradleException("File not found: ${inputPath.absolutePath}")
                }

                var originalContent = inputPath.readText()
                originalContent = originalContent.replace("{{PROJ_DIR}}", layout.projectDirectory.toString())
                originalContent = originalContent.replace("{{PARENT_DIR}}", file(layout.projectDirectory).parent)
                originalContent = originalContent.replace("{{BUILD_DIR}}", file(layout.buildDirectory).toString())

                outputPath.parentFile.mkdirs()
                outputPath.writeText(originalContent)
                println("Processed file written to: ${outputPath.absolutePath}")

            }
    }
    doLast {
        doFile("src/main/resources/stdio-mcp-servers", "resources/main/stdio-mcp-servers")
        doFile("src/main/resources/http-mcp-servers", "resources/main/http-mcp-servers")
        doFile("src/main/resources/mcp-servers", "resources/main/mcp-servers")
        doFile("src/test/resources/test-stdio-mcp-servers", "resources/test/test-stdio-mcp-servers")
        doFile("src/test/resources/test-http-mcp-servers", "resources/test/test-http-mcp-servers")
        doFile("src/test/resources/test-mcp-servers", "resources/test/test-mcp-servers")
    }
}

