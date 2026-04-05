import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm")
    kotlin("plugin.lombok")
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    api("org.jetbrains.kotlinx:kotlinx-coroutines-core-jvm:1.9.0")
    compileOnly("org.projectlombok:lombok:1.18.42")
}

java {
    version = JavaVersion.VERSION_21
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
}


