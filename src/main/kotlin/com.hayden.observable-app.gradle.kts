plugins {
    id("com.hayden.observable-lib")
}

val agent: Configuration = configurations.create("agent")
val dynamicAgent: Configuration = configurations.create("dynamicAgent")

dependencies {
    agent("io.opentelemetry.javaagent:opentelemetry-javaagent:2.0.0")
    dynamicAgent(project(":tracing_agent"))
}

val copyAgent = tasks.register<Copy>("copyAgent") {
    from(agent.singleFile)
    into(layout.buildDirectory.dir("agent"))
    rename("opentelemetry-javaagent-.*\\.jar", "opentelemetry-javaagent.jar")
}

val dynamicTracingAgent = tasks.register<Copy>("dynamicTracingAgent") {
    from(dynamicAgent.files.first { it.name.contains(".jar") })
    into(layout.buildDirectory.dir("dynamic_agent"))
    rename("tracing_agent-.*\\.jar", "tracing_agent.jar")
}

// Put this in the build.gradle of import
//tasks.compileJava {
//    dependsOn("copyAgent")
//    // java -javaagent:build/agent/opentelemetry-javaagent.jar -jar build/libs/gateway-1.0.0.jar
//}

group = "com.hayden"
version = "1.0.0"