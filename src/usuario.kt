
// Main para testeo de la clase
fun main() {

    println("Test usuario")
    val user = Usuario()
    println(user.dni)
    println(user.nombre)
  
}

class Usuario() {
    val dni: Int = 0
    val nombre: String = "as"
    val apellido: String = ""
    val telefono: Int = 0
    val email: String = ""
}