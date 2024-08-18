import com.hayden.haydenbomplugin.BuildSrcVersionCatalogCollector

plugins {
    id("com.netflix.dgs.codegen")
    id("com.hayden.base-plugin")
}

val vC = project.extensions.getByType(BuildSrcVersionCatalogCollector::class.java)

dependencies {
    testImplementation("org.springframework.graphql:spring-graphql-test")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("org.springframework.integration:spring-integration-graphql")

    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter")
    implementation("com.netflix.graphql.dgs:graphql-dgs-extended-scalars")

    vC.bundles.dgsBundle.inBundle()
        .map { implementation(it) }
}


// Put this in the build.gradle of import
//tasks.generateJava {
//    schemaPaths.add("${projectDir}/src/main/resources/graphql-client")
//    packageName = "com.hayden.gateway.codegen"
//    generateClient = true
//}
