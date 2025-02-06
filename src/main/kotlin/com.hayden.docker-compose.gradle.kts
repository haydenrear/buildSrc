plugins {
    id("com.hayden.base-plugin")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-docker-compose")
    implementation("com.github.docker-java:docker-java:3.4.1")
}

