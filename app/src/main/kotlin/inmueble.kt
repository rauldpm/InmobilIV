
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

    fun getCal() = this.calle
    fun getPor() = this.portal
    fun getPis() = this.piso
    fun getLet() = this.letra

    fun setCal(cal: String) { calle = cal }
    fun setPor(por: Int) { portal = por }
    fun setPis(pis: Int) { piso = pis }
    fun setLet(let: Char) { letra = let }

}

class Inmueble {
    var superficie: Double = 0.0
    var habitaciones: Int  = 0
    var precio: Double= 0.0
    var vivienda: Vivienda
    var propietario: String = ""
    var id: Int = 0

    constructor(sup: Double, hab: Int, pre: Double, vivienda: Vivienda, pro: String) {
        this.superficie = sup
        this.habitaciones = hab
        this.precio = pre
        this.vivienda = vivienda
        this.propietario = pro
    }

    fun getSup() = this.superficie
    fun getHab() = this.habitaciones
    fun getPre() = this.precio
    fun getViv() = this.vivienda
    fun getPro() = this.propietario
    fun getID()  = this.id

    fun setSup(sup: Double) { superficie = sup }
    fun setHab(hab: Int) { habitaciones = hab }
    fun setPre(pre: Double) { precio = pre }
    fun setViv(viv: Vivienda) { vivienda = viv }
    fun setPro(pro: String) { propietario = pro }
    fun setID(i: Int) { id = i }

}
