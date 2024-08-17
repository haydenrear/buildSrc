plugins {
    id("com.netflix.dgs.codegen")
}

dependencies {
    testImplementation("org.springframework.graphql:spring-graphql-test")
    implementation("com.netflix.graphql.dgs:graphql-dgs-spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-graphql")
    implementation("com.netflix.graphql.dgs.codegen:graphql-dgs-codegen-core:6.1.4")
    implementation("com.netflix.graphql.dgs:graphql-dgs-mocking:8.2.5")
    implementation("org.springframework.integration:spring-integration-graphql")
    implementation("com.apollographql.federation:federation-graphql-java-support:2.1.0")
    implementation("com.netflix.graphql.dgs:graphql-dgs-extended-scalars")
}


// Put this in the build.gradle of import
//tasks.generateJava {
//    schemaPaths.add("${projectDir}/src/main/resources/graphql-client")
//    packageName = "com.hayden.gateway.codegen"
//    generateClient = true
//}
