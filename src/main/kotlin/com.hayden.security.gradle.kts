plugins {
    id("com.hayden.java-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-security")
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("com.unboundid:unboundid-ldapsdk")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.withType(Test::class.java) {
    useJUnitPlatform()
}


