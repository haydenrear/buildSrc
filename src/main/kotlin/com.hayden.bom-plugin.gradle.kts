import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    `java-library`
    id("com.hayden.hayden-bom-plugin")
}

// version catalog re-exported for buildSrc
val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class.java)

dependencies {
    implementation(platform("com.hayden:hayden-bom:0.0.1"))
}