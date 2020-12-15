
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
        get("/addInmueble/{sup}/{hab}/{pre}/{cal}/{por}/{pis}/{let}/{pro}") {
            logger.info("\nLLamada /addInmueble")

            try {
                val sup = call.parameters["sup"].toString().toDouble()
                val hab = call.parameters["hab"].toString().toInt()
                val pre = call.parameters["pre"].toString().toDouble()
                val cal = call.parameters["cal"].toString()
                val por = call.parameters["por"].toString().toInt()
                val pis = call.parameters["pis"].toString().toInt()
                val let = call.parameters["let"].toString().single()
                val pro = call.parameters["pro"].toString()
            

                logger.info("\nParametros recibidos: " + "\nsup: " + sup + "\nhab: " + hab + "\npre: " + pre + "\ncal: " + cal + "\npor: " + por + "\npis: " + pis + "\nlet: " +let + "\npro: " + pro )
                
                val viv = Vivienda(cal, por, pis, let)
                logger.info("\nVivienda creada\n" + viv)

                val inm = Inmueble(sup, hab, pre, viv, pro)
                logger.info("\nInmueble creado\n" + inm)

                call.response.header("Location", "/addInmueble/{sup}/{hab}/{pre}/{cal}/{por}/{pis}/{let}/{pro}")
                call.response.status(HttpStatusCode.Created)
                call.respondText("Inmueble creado con exito")

            } catch (e : Exception) {
                logger.info("\nExcepcion encontrada /addInmueble\n" + e)

                call.response.header("Location", "/addInmueble/{sup}/{hab}/{pre}/{cal}/{por}/{pis}/{let}/{pro}")
                call.response.status(HttpStatusCode.InternalServerError)
                call.respondText("Excepcion '" + e + "' --> no corresponde al formato de ruta")
            }
        }
    }
}

fun main() {
    embeddedServer(Netty, 8080, watchPaths = listOf("MainKt"), module = Application::module).start()
}
