
import io.kotless.plugin.gradle.dsl.kotless
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    id("io.kotless") version "0.1.6"
}

// Cambia la localizacion de las carpetas de codigo predefinidas
// Fuentes en carpeta "main" en raiz
// Test en carpeta "tests" en raiz
sourceSets {
    main {
        java {
            setSrcDirs(listOf("main"))
        }
    }
    test {
        java {
            setSrcDirs(listOf("tests"))
        }
    }
}

repositories {
    jcenter()
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

    implementation(kotlin("stdlib"))
    implementation("io.kotless", "kotless-lang", "0.1.6")

}

kotless {
   config { 
       bucket = "mi.kotlin.bucket"

       terraform {
           profile = "mi.kotlin.user"
           region = "eu-west-2"
       }
   }
    extensions {
        local {
            useAWSEmulation = true
        }
    }
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
