
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach

class TestInmuebles {

    private lateinit var inmueble: Inmueble
    private lateinit var inmuebles: Inmuebles

    @BeforeEach
    fun conf() {
        inmueble = Inmueble(5.2, 3, 16.8, "calle", 4, 5, 'A', "Javier")
        inmuebles = Inmuebles()
    }

    @Test
    @DisplayName("Test Inmuebles - Comprueba constructor vacio")
    fun testConstructorEmpty() {
        assertThat(inmuebles.getSize()).isEqualTo(0)
        assertThat(inmuebles.getTop()).isEqualTo(0)
    }

    @Test
    @DisplayName("Test Inmuebles - Comprueba addInmueble(inmueble)")
    fun testAddInmueble() {
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getSize()).isEqualTo(1)
    }

    @Test
    @DisplayName("Test Inmuebles - Comprueba delInmuebleId(id)")
    fun testDelInmueblesId() {
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getSize()).isEqualTo(1)
        inmuebles.delInmuebleId(0)
        assertThat(inmuebles.getSize()).isEqualTo(0)
    }

    @Test
    @DisplayName("Test Inmuebles - Comprueba existeId(id)")
    fun testExisteId() {
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.existeId(0)).isEqualTo(true)
    }

    @Test
    @DisplayName("Test Inmuebles - Comprueba getSize()")
    fun testGetSize() {
        assertThat(inmuebles.getSize()).isEqualTo(0)
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getSize()).isEqualTo(1)
    }

    @Test
    @DisplayName("Test Inmuebles - Comprueba getTope()")
    fun testGetTope() {
        assertThat(inmuebles.getTop()).isEqualTo(0)
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getTop()).isEqualTo(1)
        inmuebles.delInmuebleId(0)
        assertThat(inmuebles.getTop()).isEqualTo(1)
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getSize()).isEqualTo(1)
        assertThat(inmuebles.getTop()).isEqualTo(2)
    }
}