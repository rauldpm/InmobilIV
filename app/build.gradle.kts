
import io.kotless.plugin.gradle.dsl.kotless
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmCompile

// Versiones 
val assert_version = "3.12.2"
val junit_version = "5.7.0"
val ktor_version = "1.4.3"
val logback_version = "1.2.3"

// Plugins a usar
plugins {
    id("org.jetbrains.kotlin.jvm") version "1.4.20"
    id("io.kotless") version "0.1.6"
}

// Indica la estructura de archivos
sourceSets {
    main {
        java {
            setSrcDirs(listOf("app/src/main"))
        }
    }
    test {
        java {
            setSrcDirs(listOf("app/src/test"))
        }
    }
}

// Repositorios de donde obtiene las dependencias necesarias
repositories {
    jcenter()
    mavenCentral()
}

// Dependencias del proyecto
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
    testImplementation("org.junit.jupiter:junit-jupiter-api:$junit_version")
    testImplementation("org.junit.jupiter:junit-jupiter:$junit_version")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:$junit_version")

    // Usado para las aserciones de los test
    testImplementation("org.assertj:assertj-core:$assert_version")

    // Para kotless serverless
    implementation("io.kotless", "kotless-lang", "0.1.6")

    // Framework ktor
    implementation("io.ktor:ktor-server-netty:$ktor_version")
    implementation("io.ktor:ktor-freemarker:$ktor_version")

    // Usado para los test de integracion, simula el servidor sin iniciarlo
    testImplementation("io.ktor:ktor-server-test-host:$ktor_version")

    // Lectura/Escritura json
    implementation("com.google.code.gson:gson:2.8.5")

}

configurations {
    "implementation" {
        exclude(group = "ch.qos.logback", module = "logback-classic")
    }
}

// Configuracion para serverless
kotless {
   config { 
       bucket = "mi.kotlin.bucket"

       terraform {
           profile = "mi.kotlin.user"
           region = "eu-west-2"
       }
   }
   webapp {
       lambda {
           kotless {
               packages = setOf("com.inmobiliv")
           }
       }
   }
   extensions {
        local {
            useAWSEmulation = true
        }
    }
}

// Indica la clase principal 
application {
    mainClass.set("com.inmobiliv.MainKt")
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

// No hace nada, necesario para hito 6
tasks.register("install"){

}
