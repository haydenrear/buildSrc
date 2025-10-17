plugins {
    id("com.hayden.base-plugin")
}

/**
 * NOTE:
 *  sometimes wiremock gets stuck, so you can run:
 *
 *  ```shell
 *  lsof -t -i :9999 | xargs kill
 *  ```
 */
dependencies {
    testImplementation("org.wiremock:wiremock-standalone:3.9.1")
}
