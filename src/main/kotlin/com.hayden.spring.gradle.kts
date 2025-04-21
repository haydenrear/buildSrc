import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.java-conventions")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}

dependencies {
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    implementation("org.springframework.boot:spring-boot")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.withType(Test::class) {
    useJUnitPlatform()
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

vC.bundles.externalBomsBundle.inBundle().forEach { println(it) }

dependencyManagement {
    imports {
        vC.bundles.externalBomsBundle.inBundle().map { mavenBom(it) }
    }
}
