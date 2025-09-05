plugins {
    id("com.hayden.spring")
}

dependencies {
    implementation("org.springframework.modulith:spring-modulith-core")
    implementation("org.springframework.modulith:spring-modulith-apt")
    implementation("org.springframework.modulith:spring-modulith-api")
    implementation("org.springframework.modulith:spring-modulith-starter-core")
    implementation("org.springframework.modulith:spring-modulith-runtime")
    implementation("org.springframework.modulith:spring-modulith-events-api")
    implementation("org.springframework.modulith:spring-modulith-events-core")
    implementation("org.springframework.modulith:spring-modulith-events-jackson")
    implementation("org.springframework.modulith:spring-modulith-docs")
    implementation("org.springframework.modulith:spring-modulith-actuator")
}