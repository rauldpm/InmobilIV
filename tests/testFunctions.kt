package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat

class TestFunctions {

    @Test
    @DisplayName("Comrpueba si el mensaje de la funcion serverless es correcto")
    fun testClassInmueble() {
        var mensaje = "InmobilIV Serverless Function v3"
        var mensajeServerless = serverless()
        // Llama al metodo "serverless"
        assertThat(mensajeServerless).isEqualTo("InmobilIV Serverless Function v4")
    }

}