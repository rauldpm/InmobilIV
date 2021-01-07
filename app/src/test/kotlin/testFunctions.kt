package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat

class TestFunctions {

    @Test
    @DisplayName("Test Serverless AWS - Comprueba mensaje /")
    fun testFunAWS() {
        var mensaje = "InmobilIV Serverless Function v4"
        var mensajeServerless = serverless()
        assertThat(mensajeServerless).isEqualTo(mensaje)
    }

    @Test
    @DisplayName("Test Serverless AWS - Comprueba mensaje /json")
    fun testFunJsonAWS() {
        var dataI = """
    {
        "inmuebles" : [
            {
                "superficie": 140.0,
                "habitaciones": 4,
                "precio": 30056.15,
                "vivienda": {
                    "calle": "Maestro Faus",
                    "portal": 4,
                    "piso": 1,
                    "letra": "D"
                },
                "propietario": "Josefo"
            },
            {
                "superficie": 452.6,
                "habitaciones": 5,
                "precio": 50000.69,
                "vivienda": {
                    "calle": "Pontezuelas",
                    "portal": 6,
                    "piso": 5,
                    "letra": "F"
                },
                "propietario": "Marijol"
            }
        ]   
    }"""

        var mensajeJson = json()
        assertThat(mensajeJson).isEqualTo(dataI)
    }

}