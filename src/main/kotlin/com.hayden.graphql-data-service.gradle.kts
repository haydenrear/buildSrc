plugins {
    id("com.hayden.spring")
    id("com.hayden.observable-app")
    id("com.hayden.graphql")
    id("com.hayden.java-conventions")
}

dependencies {
    implementation(project(":multi_agent_ide_java_parent:utilitymodule"))
    implementation(project(":graphql"))
}
