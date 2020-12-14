
package com.inmobiliv

class Inmuebles {

    var inmuebles: MutableList<Inmueble> = ArrayList()
    var cantidad: Int = 0
    
    // Constructor vacio
    constructor() {}

    constructor(inmuebles: MutableList<Inmueble>) {
        this.inmuebles = inmuebles
        this.cantidad = inmuebles.count()
    }

    fun addInmueble(inmueble: Inmueble) {
        this.inmuebles.add(inmueble)
        this.cantidad++
    }

    fun delInmueble(inmueble: Inmueble) {
        this.inmuebles.remove(inmueble)
        this.cantidad--
    }

    // Setters
    fun setSize(size: Int) { this.cantidad = size }
    fun setInm(inmuebles: MutableList<Inmueble>) { this.inmuebles = inmuebles}

    // Getters
    fun getSize() = this.cantidad
    fun getInm() = this.inmuebles

    override fun toString(): String {
  
        var array : String = ""
        
        for (item in inmuebles) 
            array += "Inmueble: " + item.toString() + "\n"
    
        return array
	}

}