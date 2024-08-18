plugins {
    id("com.hayden.base-plugin")
    id("com.hayden.persistence")
}


dependencies {
    implementation(project(":persistence"))
    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
    implementation("org.springframework.boot:spring-boot-starter-jdbc")

    implementation("com.querydsl:querydsl-sql:5.0.0")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0:jakarta")
    implementation("com.querydsl:querydsl-sql-codegen:5.0.0")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0")
}

