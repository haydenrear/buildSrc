plugins {
    id("com.hayden.base-plugin")
}

dependencies {
    implementation("org.bouncycastle:bcprov-jdk18on:1.76") // Update the version if needed
    implementation("org.bouncycastle:bctls-jdk18on:1.76") // BouncyCastle TLS provider
    implementation("org.bouncycastle:bcpkix-jdk18on:1.76") // BouncyCastle TLS provider
}