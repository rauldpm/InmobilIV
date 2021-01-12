
package com.inmobiliv

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.request.*
import io.ktor.gson.*

import org.slf4j.LoggerFactory
import com.google.gson.Gson
import java.io.FileReader

fun Application.module() {

    install(DefaultHeaders)
    install(StatusPages) {
        exception<Throwable> {
            cause -> call.respond(HttpStatusCode.InternalServerError)
            throw cause 
        }
    }
    install(ContentNegotiation) {
        gson {}
    }
    install(Routing) {
         
        val inmuebles = Inmuebles()

        var inm = Inmueble(140.0, 4, 30056.15, "Maestro Faus", 4, 1, 'D', "Javier Pecos")
        inmuebles.addInmueble(inm)
        inm = Inmueble(180.2, 2, 158654.21, "Pontezuelas", 6, 2, 'F', "Maria Pecos")
        inmuebles.addInmueble(inm)

        get("/") {}

        get("/status") {

            call.response.status(HttpStatusCode.OK)
            call.respondText("{ status: \"OK\" }")
        }

        rutaInmuebles(inmuebles) 
    }
}

fun Route.rutaInmuebles(inmuebles: Inmuebles) {
    val logger = LoggerFactory.getLogger(this::class.java.canonicalName)

    route("/inmuebles") {
        
        get {
            logger.info("\nLLamada Get Request /inmuebles")
            try {
                // Obtiene datos json de los inmuebles
                val gson = Gson().toJson(inmuebles)
                // Responde OK
                call.response.status(HttpStatusCode.OK)
                call.response.header("InmobilIV", "/inmuebles")
                // Proporciona datos
                call.respondText(gson)
            } 
            // En caso de error
            catch (e : Exception) {
                logger.info("\nExcepcion encontrada Get Request /inmuebles\n" + e)
                call.response.status(HttpStatusCode.InternalServerError)
                call.respondText("Excepcion '" + e + "'")
            }
        }
        
        post {
            logger.info("\nLLamada Post Request /inmuebles")
            try {
                // Recibe los datos json por post request
                val params = call.receiveParameters()
                var sup: Double = 0.0
                var hab: Int = 0
                var pre: Double = 0.0
                var cal: String = ""
                var por: Int = 0
                var pis: Int= 0
                var let: Char = 'a'
                var pro: String = ""
                try { 
                    sup = params["superficie"].toString().toDouble()
                    hab = params["habitaciones"].toString().toInt()
                    pre = params["precio"].toString().toDouble()
                    cal = params["calle"].toString()
                    por = params["portal"].toString().toInt()
                    pis = params["piso"].toString().toInt()
                    let = params["letra"].toString().single()
                    pro = params["propietario"].toString()
                }
                catch (e: Exception) { 
                    logger.info("\nExcepcion encontrada en formato /inmuebles\n" + e)
                    call.response.status(HttpStatusCode.BadRequest)
                    call.respondText("Error al crear inmueble, el formato no es correcto, revisa los datos")
                }

                // Crea inmueble
                val inmu = Inmueble(sup, hab, pre, cal, por, pis, let, pro)
                inmu.setID(inmuebles.getTop())
                // Añade inmueble
                inmuebles.addInmueble(inmu)
                // Responde correctemente
                call.response.status(HttpStatusCode.Created)
                call.response.header("Location", inmu.getID())
                // Responde de exito
                call.respondText("Inmueble creado con exito")
            } 
            // En caso de error
            catch (e : Exception) {
                logger.info("\nExcepcion encontrada Post Request /inmuebles\n" + e)
                call.response.status(HttpStatusCode.InternalServerError)
                call.respondText("Error al crear inmueble " + e)
            }
        }

        put("/{id}") {
            logger.info("\nLLamada Put Request /inmuebles/{id}")
            // Obtiene el id proporcionado
            val id = call.parameters["id"].toString().toInt()
            // Comprueba si hay elementos o no existe id
            if (inmuebles.getSize() == 0 || !inmuebles.existeId(id)) {
                logger.info("\nNo hay elementos")
                call.response.status(HttpStatusCode.NotFound)
                call.respondText("Ese elemento no existe")
            }
            try {
                val params = call.receiveParameters()
                var sup: Double = 0.0
                var hab: Int = 0
                var pre: Double = 0.0
                var cal: String = ""
                var por: Int = 0
                var pis: Int= 0
                var let: Char = 'a'
                var pro: String = ""
                try { 
                    sup = params["superficie"].toString().toDouble()
                    hab = params["habitaciones"].toString().toInt()
                    pre = params["precio"].toString().toDouble()
                    cal = params["calle"].toString()
                    por = params["portal"].toString().toInt()
                    pis = params["piso"].toString().toInt()
                    let = params["letra"].toString().single()
                    pro = params["propietario"].toString()
                }
                catch (e: Exception) { 
                    logger.info("\nExcepcion encontrada en formato /inmuebles/{id}\n" + e)
                    call.response.status(HttpStatusCode.BadRequest)
                    call.respondText("Error al crear inmueble, el formato no es correcto, revisa los datos")
                }
                // Crea inmueble
                val inmu = Inmueble(sup, hab, pre, cal, por, pis, let, pro)
                // Actualiza el inmueble segun el id
                inmuebles.actualizar(inmu, id)
                // Responde correctamente
                call.response.status(HttpStatusCode.OK)
                call.response.header("Location", inmu.getID())
                // Responde de exito
                call.respondText("Inmueble modificado con exito")
            } 
            // En caso de error
            catch (e : Exception) {
                logger.info("\nExcepcion encontrada Put Request /inmuebles/{id}\n" + e)
                call.response.status(HttpStatusCode.InternalServerError)
                call.respondText("Error al modificar inmueble " + e)
            }
        }

        delete("/{id}") {
            logger.info("\nLLamada Delete Request /inmuebles/{id}")
            // Obtiene el id proporcionado
            val id = call.parameters["id"].toString().toInt()
            // Comprueba si hay elementos o no existe id
            if (inmuebles.getSize() == 0 || !inmuebles.existeId(id)) {
                logger.info("\nNo hay elementos")
                call.response.status(HttpStatusCode.NotFound)
                call.respondText("Ese elemento no existe")
            }
            try {
                // Elimina el inmueble
                inmuebles.delInmuebleId(id)
                // Responde correctamente
                call.response.status(HttpStatusCode.OK)
                // Responde de exito
                call.respondText("Elemento eliminado con exito")
            }
            // En caso de error
            catch(e : Exception) {
                logger.info("\nExcepcion encontrada Delete Request /inmuebles/{id}\n" + e)
                call.response.status(HttpStatusCode.InternalServerError)
                call.response.header("InmobilIV", "/inmuebles/{id}")
                call.respondText("Error eliminar inmueble " + e)
            }
        }
    }
}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 23567
    embeddedServer(Netty, port, watchPaths = listOf("MainKt"), module = Application::module).start()
}
