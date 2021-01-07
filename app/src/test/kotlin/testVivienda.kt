
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
    @DisplayName("Test Vivienda - Comprueba valores creados por constructor")
    fun testConstructor() {
        assertThat(vivienda.calle).isEqualTo("calle")
        assertThat(vivienda.portal).isEqualTo(4)
        assertThat(vivienda.piso).isEqualTo(5)
        assertThat(vivienda.letra).isEqualTo('A')
    }

    @Test
    @DisplayName("Test Vivienda - Comprueba setters y getters")
    fun testSetGet() {
        vivienda.setCal("Alhondiga")
        vivienda.setPor(3)
        vivienda.setPis(4)
        vivienda.setLet('D')

        assertThat(vivienda.getCal()).isEqualTo("Alhondiga")
        assertThat(vivienda.getPor()).isEqualTo(3)
        assertThat(vivienda.getPis()).isEqualTo(4)
        assertThat(vivienda.getLet()).isEqualTo('D')
    }

}