import org.gradle.api.tasks.JavaExec
import org.gradle.kotlin.dsl.project
import org.gradle.kotlin.dsl.withType

plugins {
    id("com.hayden.spring")
    id("com.hayden.observable-app")
    id("com.hayden.dgs-graphql")
    id("com.hayden.java-conventions")
}

dependencies {
    implementation(project(":utilitymodule"))
    implementation(project(":shared"))
    implementation(project(":messagebroker"))
    implementation(project(":graphql"))
}


