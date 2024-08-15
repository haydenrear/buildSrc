import gradle.kotlin.dsl.accessors._285dcef16d8875fee0ec91e18e07daf9.implementation
import gradle.kotlin.dsl.accessors._285dcef16d8875fee0ec91e18e07daf9.runtimeOnly
import gradle.kotlin.dsl.accessors._285dcef16d8875fee0ec91e18e07daf9.testImplementation

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("io.opentelemetry:opentelemetry-api")
    implementation("io.opentelemetry:opentelemetry-sdk");
    implementation("io.opentelemetry:opentelemetry-exporter-logging");
    implementation("io.opentelemetry.semconv:opentelemetry-semconv:1.23.1-alpha");

    implementation("io.opentelemetry.instrumentation:opentelemetry-logback-appender-1.0:2.1.0-alpha")
    implementation("io.opentelemetry.instrumentation:opentelemetry-instrumentation-api:2.1.0")
    implementation("io.opentelemetry.instrumentation:opentelemetry-spring-boot-starter:1.22.1-alpha")
    implementation("io.opentelemetry.instrumentation:opentelemetry-instrumentation-annotations:2.1.0")
    implementation("io.opentelemetry.instrumentation:opentelemetry-jdbc:2.1.0-alpha")

    runtimeOnly("io.micrometer:micrometer-registry-prometheus")
    implementation("io.micrometer:micrometer-registry-prometheus")
    implementation("io.micrometer:context-propagation:1.1.1")
    runtimeOnly("io.micrometer:micrometer-core")
    runtimeOnly("io.micrometer:micrometer-registry-otlp")
    implementation("io.micrometer:micrometer-tracing-bridge-otel")

}

group = "com.hayden"
version = "1.0.0"