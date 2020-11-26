package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat

class TestFunctions {

    @Test
    @DisplayName("Comprueba si el mensaje de la funcion serverless de aws es correcto")
    fun testClassFunAWS() {
        var mensaje = "InmobilIV Serverless Function v4"
        var mensajeServerless = serverless()
        assertThat(mensajeServerless).isEqualTo(mensaje)
    }

}