
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach

class TestInmueble {

    private lateinit var inmueble: Inmueble

    @BeforeEach
    fun conf() {
        inmueble = Inmueble(5.2, 3, 16.8, "calle", 4, 5, 'A', "Javier")
    }

    @Test
    @DisplayName("Test Inmueble - Comprueba valores creados por constructor")
    fun testConstructor() {
        assertThat(inmueble.getSup()).isEqualTo(5.2)
        assertThat(inmueble.getHab()).isEqualTo(3)
        assertThat(inmueble.getPre()).isEqualTo(16.8)
        assertThat(inmueble.getCal()).isEqualTo("calle")
        assertThat(inmueble.getPor()).isEqualTo(4)
        assertThat(inmueble.getPis()).isEqualTo(5)
        assertThat(inmueble.getLet()).isEqualTo('A')
        assertThat(inmueble.getPro()).isEqualTo("Javier")
    }

    @Test
    @DisplayName("Test Inmueble - Comprueba setters y getters")
    fun testSetGet() {

        inmueble.setSup(3.1)
        inmueble.setHab(4)
        inmueble.setPre(34.3)
        inmueble.setCal("Alhondiga")
        inmueble.setPor(3)
        inmueble.setPis(4)
        inmueble.setLet('D')
        inmueble.setPro("Luis")
        inmueble.setID(3)

        assertThat(inmueble.getSup()).isEqualTo(3.1)
        assertThat(inmueble.getHab()).isEqualTo(4)
        assertThat(inmueble.getPre()).isEqualTo(34.3)
        assertThat(inmueble.getCal()).isEqualTo("Alhondiga")
        assertThat(inmueble.getPor()).isEqualTo(3)
        assertThat(inmueble.getPis()).isEqualTo(4)
        assertThat(inmueble.getLet()).isEqualTo('D')
        assertThat(inmueble.getPro()).isEqualTo("Luis")
        assertThat(inmueble.getID()).isEqualTo(3)
    }
}