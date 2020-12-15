
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.*


class TestRoutes {

    @Test
    @DisplayName("Comprueba la ruta /")
    fun testRouteRoot() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/") 
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals("InmobilIV Main Page", response.content)
        }
    }

    @Test
    @DisplayName("Comprueba la ruta /getInmuebles")
    fun testRouteGet() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/getInmuebles") 
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
        }
    }

    @Test
    @DisplayName("Comprueba la ruta /addInmueble")
    fun testRouteAdd() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/addInmueble/150.3/3/456.16/alhondiga/3/4/c/juan") 
        ) {
            assertEquals(HttpStatusCode.Created, response.status())
            assertEquals("Inmueble creado con exito", response.content)
        }
    }
    
}