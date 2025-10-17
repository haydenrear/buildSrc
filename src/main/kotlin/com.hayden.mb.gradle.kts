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

/**
 * NOTE:
 *  sometimes mb node gets stuck, so you can run:
 *
 *  ```shell
 * echo "Killing port $1"
 * pid=$(lsof -i:$1 | grep node | tr -s ' ' | cut -d ' ' -f 2)
 * echo "Killing $pid"
 * kill "$pid" || true
 *  ```
 *
 *  OR if you're running a lot of java
 *
 * Or probably equivalently
 * ```shell
 * ps aux | grep "[j]ava -jar" | tr -s ' ' | cut -d ' ' -f 2 | xargs kill
 * ```
 *
 */
dependencies {
    implementation("org.ndrwdn.mbgradle:mountebank:0.0.8")
    implementation("org.mbtest.javabank:javabank-client:0.4.11-SNAPSHOT-BRANCH")
    implementation("org.mbtest.javabank:javabank-core:0.4.11-SNAPSHOT-BRANCH")
}