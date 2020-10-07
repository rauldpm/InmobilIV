
// Main para testeo de la clase
fun main() {

    println("Test vivienda")
    val vivienda = Vivienda()
    println(vivienda.superficie)
    println(vivienda.propietario)
  
}

class Vivienda() {
    val superficie: Int = 0
    val habitaciones: Int = 0
    val precio: Int = 0
    val direccion: String = ""
    val propietario: String = "nadie"
}