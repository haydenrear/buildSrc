import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
    id("com.hayden.spring-app")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class)

dependencies {
    implementation("org.apache.maven.resolver:maven-resolver-impl:2.0.13")
    implementation("org.apache.maven.resolver:maven-resolver-util:2.0.13")
    implementation("org.apache.maven.resolver:maven-resolver-connector-basic:2.0.13")
    implementation("org.apache.maven.resolver:maven-resolver-supplier-mvn3:2.0.13")
}