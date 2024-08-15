plugins {
    id("com.hayden.java-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
    compileOnly("org.projectlombok:lombok")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    annotationProcessor("org.projectlombok:lombok")
    implementation("org.springframework.boot:spring-boot")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.withType(Test::class.java) {
    useJUnitPlatform()
}


