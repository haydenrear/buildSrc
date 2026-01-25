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
    implementation("com.embabel.agent:embabel-agent-starter-openai:0.3.2-SNAPSHOT")
    implementation("com.agentclientprotocol:acp:0.10.2")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.9.0")
    implementation("com.ag-ui.community:kotlin-core-jvm:0.2.4")
    implementation("org.jspecify:jspecify:1.0.0")
    implementation("com.ag-ui.community:kotlin-core-jvm:0.2.4")
    implementation("org.springaicommunity:spring-ai-agent-utils:0.3.0")

}