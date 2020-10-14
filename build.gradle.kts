

plugins {
    kotlin("jvm") version "1.4.10"
}

repositories {
    mavenCentral()
}

// Dependencias necesarias
dependencies {
    implementation(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation("org.assertj:assertj-core:3.12.2")
    
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
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