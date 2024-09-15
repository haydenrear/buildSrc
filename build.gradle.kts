plugins {
    `kotlin-dsl`
    `java-library`
}

dependencies {
    implementation("com.hayden:hayden-bom-plugin:0.0.1")
    implementation(vC.netflixDgsLib)
    implementation(vC.springBoot)
    implementation(vC.springDependencyManagement)
    implementation(vC.kotlinGradle)
}

repositories {
    gradlePluginPortal()
    mavenLocal()
    mavenCentral()
    maven {
        url = uri("https://repo.spring.io/milestone")
    }

    maven {
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}
