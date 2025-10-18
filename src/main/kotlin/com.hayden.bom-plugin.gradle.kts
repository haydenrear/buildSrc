import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    `java-library`
    id("com.hayden.hayden-bom-plugin")
}


val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    implementation(platform("com.hayden:hayden-bom:0.0.4"))
}