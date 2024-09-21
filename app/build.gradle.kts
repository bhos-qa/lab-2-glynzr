plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit 5 test framework.
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.0.1-jre")  // Replace with your correct version
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    // Define the main class for the application.
    mainClass.set("org.example.App")
}

tasks.test {
    // Use JUnit 5 platform for running the tests
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
    }
}
