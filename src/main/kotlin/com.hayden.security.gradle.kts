plugins {
    id("com.hayden.java-conventions")
}

dependencies {
    testImplementation("org.springframework.security:spring-security-test")
    testImplementation("com.unboundid:unboundid-ldapsdk")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.withType(Test::class.java) {
    useJUnitPlatform()
}


