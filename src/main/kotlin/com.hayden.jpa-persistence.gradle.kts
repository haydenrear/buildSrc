plugins {
    id("com.hayden.persistence")
}


dependencies {
    implementation(project(":persistence"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.hibernate.orm:hibernate-vector:6.4.4.Final")
//    implementation("com.pgvector:pgvector:0.1.6")
    implementation("com.querydsl:querydsl-jpa:5.0.0:jakarta")
    annotationProcessor("com.querydsl:querydsl-apt:5.0.0:jakarta")
}

