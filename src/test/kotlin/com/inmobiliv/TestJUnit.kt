
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach

class TestJUnit {

    private lateinit var vivienda: Vivienda

    @BeforeEach
    fun conf() {
        vivienda = Vivienda(5.2, 3, 16.8, "Calle Pepito", "Javier")
    }

    @Test
    @DisplayName("Comprueba si el objeto se crea correctamente")
    fun testClassMessage() {
        val message = vivienda.getMessage()
        assertThat("Soy una vivienda").isEqualTo(message)
    }

    @Test
    @DisplayName("Comprueba si la clase se ha creado con los valores dados por el constructor")
    fun testClassValues() {
        assertThat(vivienda.superficie).isEqualTo(5.2)
        assertThat(vivienda.habitaciones).isEqualTo(3)
        assertThat(vivienda.precio).isEqualTo(16.8)
        assertThat(vivienda.direccion).isEqualTo("Calle Pepito")
        assertThat(vivienda.propietario).isEqualTo("Javier")
    }

}