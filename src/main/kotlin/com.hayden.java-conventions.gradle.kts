plugins {
    `java-library`
    `maven-publish`
    id("com.hayden.base-plugin")
}


java {
    version = JavaVersion.VERSION_21
}

dependencies {

    api("org.springframework.boot:spring-boot-starter")
    api("org.springframework.boot:spring-boot-starter-aop")
    api("org.springframework.boot:spring-boot-starter-logging")
    api("org.springframework.boot:spring-boot-starter-webflux")
    api("org.springframework.boot:spring-boot-starter-web")
    api("org.springframework.boot:spring-boot-starter-rsocket")
    api("org.springframework.boot:spring-boot-configuration-processor")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.testcontainers:postgresql:1.19.4")

//    runtimeOnly("org.springframework.boot:spring-boot-devtools")

    implementation("org.jsoup:jsoup:1.16.1")

//    api("com.hayden:rule-sequence:0.1")
//    api("com.hayden.service-stub:spring-boot-starter-service-stub:1.0.0")

    api("org.eclipse.collections:eclipse-collections-api:11.0.0")
    api("org.eclipse.collections:eclipse-collections:11.0.0")
    api("org.apache.commons:commons-lang3:3.17.0")
    api("org.apache.commons:commons-math3:3.6.1")
    api("org.apache.commons:commons-compress:1.27.1")

    implementation("io.netty:netty-transport-native-epoll:4.1.84.Final")


    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    testCompileOnly( "org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor( "org.projectlombok:lombok:1.18.30")

    api("com.google.guava:guava:30.1.1-jre")

    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
    testImplementation("io.projectreactor:reactor-test:3.6.0")

    api("org.reflections:reflections:0.10.2")

    testImplementation("org.junit.platform:junit-platform-suite-api:1.7.2")
    testImplementation("org.junit.platform:junit-platform-runner:1.7.2")
    testImplementation("org.junit:junit-bom:5.8.0-M1")
    testImplementation("org.testcontainers:testcontainers:1.16.2")
    testImplementation("org.testcontainers:junit-jupiter:1.16.2")
}


group = "com.hayden"
version = "1.0.0"


tasks.withType(Test::class.java) {
    useJUnitPlatform()
}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc>() {
    options.encoding = "UTF-8"
}

tasks.withType<JavaCompile> {
//    options.compilerArgs.add("--enable-preview")
}

tasks.withType<Test> {
//    jvmArgs("--enable-preview")
}

tasks.withType<JavaExec> {
//    jvmArgs("--enable-preview")
}


