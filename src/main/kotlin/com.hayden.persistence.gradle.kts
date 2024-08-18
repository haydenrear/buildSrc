plugins {
    id("com.hayden.base-plugin")
}


dependencies {
    implementation("org.liquibase:liquibase-core")
    implementation("org.postgresql:postgresql")
    testImplementation("com.h2database:h2")
    implementation("org.liquibase:liquibase-core")

    implementation("io.hypersistence:hypersistence-tsid:2.1.2")
    annotationProcessor("jakarta.persistence:jakarta.persistence-api:3.1.0")
    implementation("jakarta.persistence:jakarta.persistence-api:3.1.0")
}

