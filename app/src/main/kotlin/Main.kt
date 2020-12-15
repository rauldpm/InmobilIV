
package com.inmobiliv

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.freemarker.*
import freemarker.cache.ClassTemplateLoader
import org.slf4j.LoggerFactory
import com.google.gson.Gson
import java.io.FileReader

fun Application.module() {

    val logger = LoggerFactory.getLogger(this::class.java.canonicalName)

    install(DefaultHeaders)
    install(StatusPages) {
        exception<Throwable> {
            cause -> call.respond(HttpStatusCode.InternalServerError)
            throw cause 
        }
    }
    install(FreeMarker){
        templateLoader = ClassTemplateLoader(this::class.java.classLoader, "templates")
    }
    install(Routing) {
        get("/") {
            logger.info("\nLLamada /")

            call.response.header("Location", "/")
            call.response.status(HttpStatusCode.OK)
            call.respond(FreeMarkerContent("index.ftl", null))
        }
        get("/getInmuebles") {
            logger.info("\nLLamada /getInmuebles")
        
            try {
                val gson = Gson()
                val inmuebles: Inmuebles = gson.fromJson(FileReader("src/main/resources/data/data.json"), Inmuebles::class.java)

                logger.info("\nInmuebles creado desde fichero\n" + inmuebles)

                call.response.header("Location", "/inmuebles")
                call.response.status(HttpStatusCode.OK)
                call.respondText(inmuebles.toString(), ContentType.Text.Html)

            } catch (e : Exception) {
                logger.info("\nExcepcion encontrada /inmuebles\n" + e)

                call.response.header("Location", "/inmuebles")
                call.response.status(HttpStatusCode.InternalServerError)
                call.respondText("Excepcion '" + e + "'")
            }
        }
    }
}

fun main() {
    embeddedServer(Netty, 8080, watchPaths = listOf("MainKt"), module = Application::module).start()
}
