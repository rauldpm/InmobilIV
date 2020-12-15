
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


    
}