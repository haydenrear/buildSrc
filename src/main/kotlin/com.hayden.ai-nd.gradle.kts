import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = extensions.getByType(com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector::class)

dependencies {
    vC.bundles.dglBundle.inBundle()
        .map { implementation(it) }

    implementation("com.fasterxml.jackson.module:jackson-module-jsonSchema:2.18.3")

}