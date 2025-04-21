import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.ai")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.springAiClientBundle.inBundle()
        .map { implementation(it) }
}