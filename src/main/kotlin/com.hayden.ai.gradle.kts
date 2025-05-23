import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.dglBundle.inBundle()
        .map { implementation(it) }
    vC.bundles.springAiClientBundle.inBundle()
        .map { implementation(it) }
    vC.bundles.springAiServerBundle.inBundle()
        .map { implementation(it) }
    vC.bundles.springAiBundle.inBundle()
        .map { implementation(it) }

    implementation("com.fasterxml.jackson.module:jackson-module-jsonSchema:2.18.3")

}