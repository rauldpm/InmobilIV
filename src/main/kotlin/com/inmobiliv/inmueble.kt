
package com.inmobiliv

// Esta clase simula a un struct
class Vivienda {
    var calle: String = ""
    var portal: Int = 0
    var piso: Int = 0
    var letra: Char = ' '

    constructor(calle: String, portal: Int, piso: Int, letra: Char) {
        this.calle = calle
        this.portal = portal
        this.piso = piso
        this.letra = letra
    }
}

class Inmueble {
    var superficie: Double = 0.0
    var habitaciones: Int  = 0
    var precio: Double= 0.0
    var vivienda: Vivienda
    var propietario: String = ""

    constructor(sup: Double, hab: Int, pre: Double, vivienda: Vivienda, pro: String) {
        this.superficie = sup
        this.habitaciones = hab
        this.precio = pre
        this.vivienda = vivienda
        this.propietario = pro
    }

    // Mensaje para testear la creacion del objeto inmueble
    fun getMessage(): String { return "Soy un inmueble" }

    // Getters
    fun getSup() = this.superficie
    fun getHab() = this.habitaciones
    fun getPre() = this.precio
    fun getViv() = this.vivienda
    fun getPro() = this.propietario

    // Setters
    fun setSup(sup: Double) { superficie = sup }
    fun setHab(hab: Int) { habitaciones = hab }
    fun setPre(pre: Double) { precio = pre }
    fun setViv(viv: Vivienda) { vivienda = viv }
    fun setPro(pro: String) { propietario = pro }

    


}
