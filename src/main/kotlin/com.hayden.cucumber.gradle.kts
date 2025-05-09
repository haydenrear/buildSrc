plugins {
    id("com.hayden.spring")
}

dependencies {
    implementation("org.junit.platform:junit-platform-suite")
    implementation("org.junit.jupiter:junit-jupiter-api")
    implementation("org.junit.platform:junit-platform-suite-api:1.11.0")
    implementation("io.cucumber:cucumber-spring:7.18.1")
    implementation("io.cucumber:cucumber-java:7.18.1")
    implementation("io.cucumber:cucumber-junit:7.18.1")
    implementation("io.cucumber:cucumber-junit-platform-engine:7.18.1")
    implementation("org.assertj:assertj-core:3.26.3")
}