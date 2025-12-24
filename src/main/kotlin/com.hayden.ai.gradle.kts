import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
    id("com.hayden.mcp")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.dglBundle.inBundle()
        .map { implementation(it) }
    vC.bundles.springAiBundle.inBundle()
        .map { implementation(it) }

    implementation("com.fasterxml.jackson.module:jackson-module-jsonSchema:2.18.3")
    implementation("org.springframework.ai:spring-ai-starter-model-ollama")
    implementation("org.springframework.ai:spring-ai-starter-mcp-server-webmvc")

}