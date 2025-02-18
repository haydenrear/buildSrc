import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.dglBundle.inBundle()
        .map { implementation(it) }
//    implementation(vC.libs.vertexAi)
    runtimeOnly("ai.djl.pytorch:pytorch-native-cpu:2.0.1:osx-aarch64")
    implementation("org.springframework.experimental:mcp:0.6.0")
    implementation("io.modelcontextprotocol:kotlin-sdk:0.2.0")
}