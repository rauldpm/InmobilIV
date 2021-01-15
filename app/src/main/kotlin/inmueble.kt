
package com.inmobiliv

class Inmueble {
    var superficie: Double = 0.0
    var habitaciones: Int  = 0
    var precio: Double= 0.0
    var calle: String = ""
    var portal: Int = 0
    var piso: Int = 0
    var letra: Char = ' '
    var propietario: String = ""
    var id: Int = 0

    constructor() { }

    constructor(sup: Double, hab: Int, pre: Double, cal: String, por: Int, pis: Int, let: Char, pro: String) {
        this.superficie = sup
        this.habitaciones = hab
        this.precio = pre
        this.calle = cal
        this.portal = por
        this.piso = pis
        this.letra = let
        this.propietario = pro
    }

    fun getSup() = this.superficie
    fun getHab() = this.habitaciones
    fun getPre() = this.precio
    fun getCal() = this.calle
    fun getPor() = this.portal
    fun getPis() = this.piso
    fun getLet() = this.letra
    fun getPro() = this.propietario
    fun getID()  = this.id

    fun setSup(sup: Double) { superficie = sup }
    fun setHab(hab: Int) { habitaciones = hab }
    fun setPre(pre: Double) { precio = pre }
    fun setCal(cal: String) { calle = cal }
    fun setPor(por: Int) { portal = por }
    fun setPis(pis: Int) { piso = pis }
    fun setLet(let: Char) { letra = let }
    fun setPro(pro: String) { propietario = pro }
    fun setID(i: Int) { id = i }

}
