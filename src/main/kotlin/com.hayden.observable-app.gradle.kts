plugins {
    id("com.hayden.observable-lib")
}

val agent: Configuration = configurations.create("agent")
val dynamicAgent: Configuration = configurations.create("dynamicAgent")
val promAgent: Configuration = configurations.create("promAgent")

dependencies {
    agent("io.opentelemetry.javaagent:opentelemetry-javaagent:2.0.0")
    promAgent("io.prometheus.jmx:jmx_prometheus_javaagent:1.0.1")
    dynamicAgent(project(":tracing_agent"))
}

val copyPromAgent = tasks.register<Copy>("copyPromAgent") {
    from(promAgent.singleFile)
    into(layout.buildDirectory.dir("agent"))
    rename("jmx_prometheus_javaagent-.*\\.jar", "prometheus-javaagent.jar")
// java -Dfluentd.logger.sender.class=com.hayden.utilitymodule.telemetry.log.FluentDRestTemplateSender -Dorg.springframework.boot.logging.LoggingSystem=com.hayden.tracing.TracingLogback -javaagent:commit-diff-context/build/agent/prometheus-javaagent.jar=12345:commit-diff-context/prom-config.yaml jar app-jar.jar
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