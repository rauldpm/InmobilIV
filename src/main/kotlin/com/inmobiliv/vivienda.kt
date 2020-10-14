
package com.inmobiliv

class Vivienda {
    var superficie: Double = 0.0
    var habitaciones: Int  = 0
    var precio: Double= 0.0
    var direccion: String = ""
    var propietario: String = ""

    constructor(sup: Double, hab: Int, pre: Double, dir: String, pro: String) {
        this.superficie = sup
        this.habitaciones = hab
        this.precio = pre
        this.direccion = dir
        this.propietario = pro
    }

    // Mensaje para testear la creacion del objeto Vivienda
    fun getMessage(): String { return "Soy una vivienda" }

    // Getters
    fun getSup() = this.superficie
    fun getHab() = this.habitaciones
    fun getPre() = this.precio
    fun getDir() = this.direccion
    fun getPro() = this.propietario

    // Setters
    fun setSup(sup: Double) { superficie = sup }
    fun setHab(hab: Int) { habitaciones = hab }
    fun setPre(pre: Double) { precio = pre }
    fun setDir(dir: String) { direccion = dir }
    fun setPro(pro: String) { propietario = pro }

}
