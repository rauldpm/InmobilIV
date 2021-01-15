
package com.inmobiliv

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.DisplayName

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.server.testing.*
import org.json.JSONObject
import kotlin.test.*

import java.io.File
import java.io.BufferedReader


class TestRoutes {

    @Test
    @DisplayName("Test /status")
    fun testStatus() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/status") 
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals(response.content, "{ status: \"OK\" }")
        }
    } 
    
    @Test
    @DisplayName("Test Requests HTTP - GET /todo")
    fun testGetTodo() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/todo") 
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertTrue(response.contentType().toString().contains("text/plain"))
        }
    }

    @Test
    @DisplayName("Test Get Http /inmuebles/id")
    fun testGet() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/inmuebles/0") 
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertTrue(response.contentType().toString().contains("text/plain"))
        }
    }



    @Test
    @DisplayName("Test Request HTTP - Comprueba POST")
    fun testPost() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Post, "/inmuebles") {
                addHeader(HttpHeaders.ContentType, ContentType.Application.Json.toString())
                val json = JSONObject("""{"superficie":"122.2","habitaciones":"3","precio":"12556.36","calle":"Pedro Antorio","portal":"3","piso":"4","letra":"F","propietario":"Magdalena"}""")
                setBody(json.toString())}
        ) {
            assertEquals(HttpStatusCode.Created, response.status())
            assertEquals(response.content, "Inmueble creado con exito")
        }
    }

    @Test
    @DisplayName("Test Request HTTP - Comprueba PUT")
    fun testPut() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Put, "/inmuebles/0") {
                addHeader(HttpHeaders.ContentType, ContentType.Application.Json.toString())
                val json = JSONObject("""{"superficie":"122.2","habitaciones":"3","precio":"12556.36","calle":"Pedro Antorio","portal":"3","piso":"4","letra":"F","propietario":"Magdalena"}""")
                setBody(json.toString())
            }
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals(response.content, "Inmueble modificado con exito")
        }
    }

    @Test
    @DisplayName("Test Request HTTP - Comprueba DELETE")
    fun testDelete() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Delete, "/inmuebles/0")
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
        }
    }
    
}