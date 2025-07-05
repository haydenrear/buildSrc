plugins {
    id("com.hayden.base-plugin")
}


dependencies {
    implementation("org.liquibase:liquibase-core")
    implementation("org.postgresql:postgresql")
    implementation("org.liquibase:liquibase-core")

    implementation("io.hypersistence:hypersistence-tsid:2.1.4")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
}

