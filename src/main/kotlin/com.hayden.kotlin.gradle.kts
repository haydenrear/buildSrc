import gradle.kotlin.dsl.accessors._3743b5a2d0979aeed8493201d618fc18.api
import gradle.kotlin.dsl.accessors._3743b5a2d0979aeed8493201d618fc18.compileOnly
import gradle.kotlin.dsl.accessors._3743b5a2d0979aeed8493201d618fc18.testImplementation
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.support.kotlinCompilerOptions

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
    kotlinOptions {
        jvmTarget = "21"
    }
}


