import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector
import gradle.kotlin.dsl.accessors._086de0b619b2f48ffb4e52cf6de7d048.implementation

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.dglBundle.inBundle()
        .map { implementation(it) }
//    implementation(vC.libs.vertexAi)
    runtimeOnly("ai.djl.pytorch:pytorch-native-cpu:2.0.1:osx-aarch64")
    implementation("com.fasterxml.jackson.module:jackson-module-jsonSchema:2.18.3")
}