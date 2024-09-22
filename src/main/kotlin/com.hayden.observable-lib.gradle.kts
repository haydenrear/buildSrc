import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class.java)

dependencies {
    vC.bundles.opentelemetryBundle.inBundle()
        .map { implementation(it) }

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.opentelemetry:opentelemetry-api")
    implementation("io.opentelemetry:opentelemetry-sdk")
    implementation("io.opentelemetry:opentelemetry-exporter-logging")

    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
    implementation("io.micrometer:micrometer-registry-prometheus")
    implementation("io.micrometer:context-propagation:1.1.1")
    runtimeOnly("io.micrometer:micrometer-core")
    runtimeOnly("io.micrometer:micrometer-registry-otlp")
    implementation("io.micrometer:micrometer-tracing-bridge-otel")

}

group = "com.hayden"
version = "1.0.0"