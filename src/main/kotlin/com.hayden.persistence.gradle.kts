plugins {
    id("com.hayden.base-plugin")
}


dependencies {
    implementation("io.hypersistence:hypersistence-tsid:2.1.2")
    implementation("org.liquibase:liquibase-core")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("org.postgresql:postgresql")
    testImplementation("com.h2database:h2")
    implementation("org.liquibase:liquibase-core")
}

