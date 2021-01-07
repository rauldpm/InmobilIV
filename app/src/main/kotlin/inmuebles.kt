
package com.inmobiliv

class Inmuebles {

    var inmuebles: MutableList<Inmueble> = ArrayList()
    var tope: Int = 0
    
    constructor() {}

    constructor(inmuebles: MutableList<Inmueble>) {
        this.inmuebles = inmuebles
    }

    fun addInmueble(inmueble: Inmueble) {
        inmueble.setID(tope)
        this.inmuebles.add(inmueble)
        tope += 1
    }


    fun existeId(id: Int): Boolean {
        for (item in this.inmuebles) 
            if (item.id == id) 
                return true
        return false
    }



    fun getSize() = this.inmuebles.count()
    fun getTop() = this.tope
}