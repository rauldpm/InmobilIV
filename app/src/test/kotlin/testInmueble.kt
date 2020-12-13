
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
    @DisplayName("Comprueba si el objeto Inmueble se ha creado con los valores dados por el constructor")
    fun testClassInmueble() {

        // Comprobacion de valores de vivienda referente al inmueble
        assertThat(inmueble.vivienda.calle).isEqualTo("calle")
        assertThat(inmueble.vivienda.portal).isEqualTo(4)
        assertThat(inmueble.vivienda.piso).isEqualTo(5)
        assertThat(inmueble.vivienda.letra).isEqualTo('A')

        // Comprobacion de valores de inmueble
        assertThat(inmueble.getSup()).isEqualTo(5.2)
        assertThat(inmueble.getHab()).isEqualTo(3)
        assertThat(inmueble.getPre()).isEqualTo(16.8)
        assertThat(inmueble.getViv()).isEqualTo(vivienda)
        assertThat(inmueble.getPro()).isEqualTo("Javier")
    }


}