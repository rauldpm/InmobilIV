
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach

class TestInmueble {

    private lateinit var vivienda: Vivienda
    private lateinit var inmueble: Inmueble

    @BeforeEach
    fun conf() {
        vivienda = Vivienda("calle", 4, 5, 'A')
        inmueble = Inmueble(5.2, 3, 16.8, vivienda, "Javier")
    }

    @Test
    @DisplayName("Test Inmueble - Comprueba valores creados por constructor")
    fun testConstructor() {
        assertThat(inmueble.getSup()).isEqualTo(5.2)
        assertThat(inmueble.getHab()).isEqualTo(3)
        assertThat(inmueble.getPre()).isEqualTo(16.8)
        assertThat(inmueble.getViv()).isEqualTo(vivienda)
        assertThat(inmueble.getPro()).isEqualTo("Javier")
    }

    @Test
    @DisplayName("Test Inmueble - Comprueba setters y getters")
    fun testSetGet() {

        var viv = Vivienda("Alhondiga", 3, 4, 'D')

        inmueble.setSup(3.1)
        inmueble.setHab(4)
        inmueble.setPre(34.3)
        inmueble.setViv(viv)
        inmueble.setPro("Luis")
        inmueble.setID(3)

        assertThat(inmueble.getSup()).isEqualTo(3.1)
        assertThat(inmueble.getHab()).isEqualTo(4)
        assertThat(inmueble.getPre()).isEqualTo(34.3)
        assertThat(inmueble.getPro()).isEqualTo("Luis")
        assertThat(inmueble.getViv()).isEqualTo(viv)
        assertThat(inmueble.getID()).isEqualTo(3)
    }
}