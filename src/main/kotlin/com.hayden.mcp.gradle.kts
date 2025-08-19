import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.springAiClientBundle.inBundle()
        .map { implementation(it) }
    vC.bundles.springAiServerBundle.inBundle()
        .map { implementation(it) }
}