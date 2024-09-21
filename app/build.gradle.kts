plugins {
   
    application
}

repositories {
    
    mavenCentral()
}

dependencies {
  
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

   
    implementation("com.google.guava:guava:31.0.1-jre")  
}


java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
   
    mainClass.set("org.example.App")
}

tasks.test {
   
    useJUnitPlatform()
    testLogging {
        events("passed", "failed", "skipped")
    }
}
