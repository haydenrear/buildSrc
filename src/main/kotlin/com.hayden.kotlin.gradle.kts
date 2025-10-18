import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.23")
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.7.3")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-jdk9:1.7.3")
    api("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.9.20")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.9.20")
//    api("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
}

java {
    version = JavaVersion.VERSION_21
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
}


