plugins {
    id("com.hayden.spring")
    id("com.hayden.observable-app")
    id("com.hayden.graphql")
    id("com.hayden.java-conventions")
}

dependencies {
    implementation(project(":utilitymodule"))
    implementation(project(":graphql"))
}
