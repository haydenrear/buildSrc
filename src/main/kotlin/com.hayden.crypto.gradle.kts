import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector
import gradle.kotlin.dsl.accessors._3743b5a2d0979aeed8493201d618fc18.implementation

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class.java)

dependencies {
    vC.bundles.bcBundle.inBundle()
        .map { implementation(it) }
}