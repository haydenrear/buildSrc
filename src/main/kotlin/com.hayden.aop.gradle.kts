import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class.java)

dependencies {
    implementation(vC.libs.aspectJWeaver)
    implementation("org.springframework.boot:spring-boot-starter-aop")
}