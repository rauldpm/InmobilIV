
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

    // curl -X "GET" http://0.0.0.0:8080/inmuebles
    @Test
    @DisplayName("Test Requests HTTP - Comprueba GET")
    fun testRouteGet() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/inmuebles") 
        ) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertTrue(response.contentType().toString().contains("text/plain"))
        }
    }

    // curl --data '{"superficie":"112.2","habitaciones":"3","precio":"12556.36","calle":"Pedro Antonio","portal":"3","piso":"4","letra":"F","propietario":"Javier Iañez"}' -H "Content-Type: application/json" --request POST http://0.0.0.0:8080/inmuebles
    @Test
    @DisplayName("Test Request HTTP - Comprueba POST")
    fun testPost() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Post, "/inmuebles") {
                addHeader(HttpHeaders.ContentType, ContentType.Application.Json.toString())
                val json = JSONObject("""{"superficie":"122.2","habitaciones":"3","precio":"12556.36","calle":"Pedro Antorio","portal":"3","piso":"4","letra":"F","propietario":"Javier Iañez"}""")
                setBody(json.toString())
            }
        ) {
            assertEquals(HttpStatusCode.Created, response.status())
            assertTrue(response.contentType().toString().contains("text/plain"))
        }
    }

    // curl --data '{"superficie":"140.0","habitaciones":"4","precio":"30056.15","vivienda":{"calle":"Maestro Faus","portal":4,"piso":1,"letra":"D"},"propietario":"Magdalena"}' -H "Content-Type: application/json" --request PUT http://localhost:8080/inmuebles/0
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
            assertTrue(response.contentType().toString().contains("text/plain"))
        }
    }

    // curl -X "DELETE" http://0.0.0.0:8080/inmuebles/0
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