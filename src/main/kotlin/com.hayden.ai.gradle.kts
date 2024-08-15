plugins {
    id("com.hayden.base-plugin")
    id("com.hayden.bom-plugin")
}

dependencies {
    implementation("com.google.cloud:google-cloud-vertexai")
    runtimeOnly("ai.djl.pytorch:pytorch-jni:2.0.1-0.25.0")
    runtimeOnly("ai.djl.pytorch:pytorch-engine:0.25.0")
    runtimeOnly("ai.djl.pytorch:pytorch-native-cpu:2.0.1:osx-aarch64")
    implementation("ai.djl:api:0.24.0")
}