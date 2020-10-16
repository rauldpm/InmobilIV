
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach

class TestInmuebles {

    private lateinit var vivienda: Vivienda
    private lateinit var inmueble: Inmueble
    private lateinit var inmuebles: Inmuebles

    @BeforeEach
    fun conf() {
        vivienda = Vivienda("calle", 4, 5, 'A')
        inmueble = Inmueble(5.2, 3, 16.8, vivienda, "Javier")
        inmuebles = Inmuebles()
    }

    @Test
    @DisplayName("Comprueba si permite añadir un objeto inmueble a la lista de inmuebles")
    fun testClassInmueblesAdd() {
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getInm().count()).isEqualTo(1)
    }

    @Test
    @DisplayName("Comprueba si el objeto añadido es el mismo que esta almacenado")
    fun testClassInmueblesCheckIntegrity() {
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getInm().getOrNull(0)).isEqualTo(inmueble)
    }

    @Test
    @DisplayName("Comprueba si permite eliminar un inmueble")
    fun testClassInmueblesDel() {
        inmuebles.addInmueble(inmueble)
        assertThat(inmuebles.getInm().count()).isEqualTo(1)
        inmuebles.delInmueble(inmueble)
        assertThat(inmuebles.getInm().count()).isEqualTo(0)
    }

    @Test
    @DisplayName("Comprueba si el numero de inmuebles registrados corresponde con el numero real de inmuebles")
    fun testClassInmuebles() {
        var vivienda1 = Vivienda("avenida", 5, 3, 'C')
        var inmueble1 = Inmueble(15.2, 4, 35.8, vivienda1, "Pepa")
        inmuebles.addInmueble(inmueble1)
        assertThat(inmuebles.getInm().count()).isEqualTo(inmuebles.getSize())
    }

    @Test
    @DisplayName("Comprueba si Inmuebles permite cambiar el indicador de cantidad de inmuebles")
    fun testClassInmueblesSetSize() {
        assertThat(inmuebles.getInm().count()).isEqualTo(0)
        inmuebles.setSize(4)
        assertThat(inmuebles.getSize()).isEqualTo(4)
    }
}