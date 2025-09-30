import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.opentelemetryBundle.inBundle()
        .map { implementation(it) }
    vC.bundles.micrometerBundle.inBundle()
        .map { implementation(it) }

    implementation("org.springframework.boot:spring-boot-starter-actuator")

//    implementation("io.micrometer:context-propagation:1.1.1")
//    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
//    implementation("io.micrometer:micrometer-registry-prometheus")
//    runtimeOnly("io.micrometer:micrometer-core")
//    runtimeOnly("io.micrometer:micrometer-registry-otlp")
//    implementation("io.micrometer:micrometer-tracing-bridge-otel")

}

group = "com.hayden"
version = "1.0.0"