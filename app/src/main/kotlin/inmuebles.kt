
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

    fun delInmuebleId(id: Int) {
        for (item in this.inmuebles) 
            if (item.id == id) {
                this.inmuebles.remove(item)
                break
            }
    }

    fun existeId(id: Int): Boolean {
        for (item in this.inmuebles) 
            if (item.id == id) 
                return true
        return false
    }

    fun actualizar(inmu: Inmueble, id: Int) {
        var pos: Int = 0
        for (item in this.inmuebles) {
            if (item.id == id) {
                this.inmuebles.set(pos, inmu)
                break
            }
            pos += 1
        }
    }

    fun getSize() = this.inmuebles.count()
    fun getTop() = this.tope
}