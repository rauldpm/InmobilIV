
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach

class TestVivienda {

    private lateinit var vivienda: Vivienda

    @BeforeEach
    fun conf() {
        vivienda = Vivienda("calle", 4, 5, 'A')
    }

    @Test
    @DisplayName("Comprueba si  el objeto Vivienda se ha creado con los valores dados por el constructor")
    fun testClassVivienda() {
        // Comprobacion de valores de vivienda referente al inmueble
        assertThat(vivienda.calle).isEqualTo("calle")
        assertThat(vivienda.portal).isEqualTo(4)
        assertThat(vivienda.piso).isEqualTo(5)
        assertThat(vivienda.letra).isEqualTo('A')
    }
}