plugins {
    id("com.hayden.base-plugin")
}

dependencies {
    implementation("org.springframework.kafka:spring-kafka")
    implementation("org.springframework.boot:spring-boot-starter-integration")
    implementation("org.springframework.integration:spring-integration-core")
    implementation("org.springframework.integration:spring-integration-http")
    api("org.apache.kafka:kafka-streams")
    api("org.springframework.kafka:spring-kafka")
    testImplementation("org.springframework.kafka:spring-kafka-test:3.1.2")
    testImplementation("org.testcontainers:kafka:1.19.4")
}

