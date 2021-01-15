
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
            logger.info("\nLLamada Get Request /todo")
            // Obtiene datos json de los inmuebles
            val gson = Gson().toJson(inmuebles)
            // Responde OK
            call.response.status(HttpStatusCode.OK)
            // Proporciona datos
            call.respondText(gson)
        }
        get("/{id}") {
            logger.info("\nLLamada Get Request /inmuebles/{id}")
            val id = call.parameters["id"].toString().toInt()
            if (inmuebles.getSize() == 0 || !inmuebles.existeId(id)) {
                logger.info("\nNo hay elementos")
                call.response.status(HttpStatusCode.NotFound)
                call.respondText("Ese elemento no existe")
            }
            val inmu: Inmueble = inmuebles.getInmu(id)
            call.response.status(HttpStatusCode.OK)
            call.respondText(Gson().toJson(inmu))
        }
        
        post {
            logger.info("\nLLamada Post Request /inmuebles")

            // Recibe los datos json por post request y crea inmueble
            var inmu: Inmueble = Inmueble()
            try {
                inmu = call.receive<Inmueble>()
            }
            catch (e: Exception) { 
                logger.info("\nExcepcion encontrada en POST /inmuebles\n" + e)
                call.response.status(HttpStatusCode.BadRequest)
                call.respondText("Error al crear inmueble, el formato no es correcto, revisa los datos")
            }

            inmu.setID(inmuebles.getTop())
            // Añade inmueble
            inmuebles.addInmueble(inmu)
            // Responde correctemente
            call.response.status(HttpStatusCode.Created)
            call.response.header("Location", "/inmuebles/"+inmu.getID())
            // Responde de exito
            call.respondText("Inmueble creado con exito")
           
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
            
            // Recibe los datos json por post request y crea inmueble
            var inmu: Inmueble = Inmueble()
            try {
                inmu = call.receive<Inmueble>()
            }
            catch (e: Exception) { 
                logger.info("\nExcepcion encontrada en PUT /inmuebles\n" + e)
                call.response.status(HttpStatusCode.BadRequest)
                call.respondText("Error al crear inmueble, el formato no es correcto, revisa los datos")
            }
            // Actualiza el inmueble segun el id
            inmuebles.actualizar(inmu, id)
            // Responde correctamente
            call.response.status(HttpStatusCode.OK)
            call.response.header("Location", "/inmuebles/"+inmu.getID())
            // Responde de exito
            call.respondText("Inmueble modificado con exito")
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
            // Elimina el inmueble
            inmuebles.delInmuebleId(id)
            // Responde correctamente
            call.response.status(HttpStatusCode.OK)
            // Responde de exito
            call.respondText("Elemento eliminado con exito")
        }
    }
}

fun main() {
    val port = System.getenv("PORT")?.toInt() ?: 23567
    embeddedServer(Netty, port, watchPaths = listOf("MainKt"), module = Application::module).start()
}
