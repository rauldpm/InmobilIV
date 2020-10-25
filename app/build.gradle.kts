/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.7/userguide/building_java_projects.html
 */

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.72"

    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use mavenCentral for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    // JUnit5 - Usado para los tests
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")

    // Usado para las aserciones de los test
    testImplementation("org.assertj:assertj-core:3.12.2")
}

application {
    // Define the main class for the application.
    mainClass.set("InmobilIV.AppKt")
}

// Tarea que ejecuta el test principal
tasks {
    test {
        useJUnitPlatform()
        testLogging {
            showStandardStreams = true
            events("passed", "failed", "skipped")
        }
    }
}

// Tarea que comprueba si el proyecto compila, tanto las clases como sus test
tasks.register("compila") {
    println("Compilando ficheros principales...")
    dependsOn("compileKotlin")
    println("Compilando ficheros test...")
    dependsOn("compileTestKotlin")

}

// Tarea que pregunta
tasks.register("pregunta") {
    doLast {
        println("¿Quien eres?")
    }
}

// Tarea que responde -> tiene dependencia de la tarea "pregunta"
tasks.register("respuesta") {
    dependsOn("pregunta")
    doFirst {
        println("Soy Gradle")
    }
}
