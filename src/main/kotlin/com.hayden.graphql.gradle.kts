
plugins {
    id("com.hayden.base-plugin")
}

dependencies {
    testImplementation("org.springframework.graphql:spring-graphql-test")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.springframework.integration:spring-integration-graphql")
}
