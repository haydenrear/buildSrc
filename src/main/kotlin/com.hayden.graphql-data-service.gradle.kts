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
    implementation("com.fasterxml.jackson.module:jackson-module-jsonSchema:2.18.3")
}


