plugins {
    id("com.hayden.base-plugin")
    id("org.ndrwdn.mbgradle")
}

//node {
//    download.set(true)
//    workDir.set(projectDir.resolve("${mountebank.mbScriptPath}/node"))
//    npmWorkDir.set(projectDir.resolve("${mountebank.mbScriptPath}/node/node-v${node.version.get()}-${node.resolvedPlatform.get().name}-${node.resolvedPlatform.get().arch}/npm"))
//    nodeProjectDir.set(projectDir.resolve(mountebank.mbScriptPath))
//}

tasks.nodeSetup {
    dependsOn("acquireMountebank")
}

tasks.startMountebank {
    dependsOn("nodeSetup", "npmSetup", "npmInstall")
}

dependencies {
    implementation("org.ndrwdn.mbgradle:mountebank:0.0.8")
    implementation("org.mbtest.javabank:javabank-client:0.4.10")
    implementation("org.mbtest.javabank:javabank-core:0.4.10")
}