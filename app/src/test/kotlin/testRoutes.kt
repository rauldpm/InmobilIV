
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
    @DisplayName("Test Requests HTTP - Comprueba GET")
    fun testRouteGet() = withTestApplication(Application::module){
        with ( 
            handleRequest(HttpMethod.Get, "/inmuebles") 
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
                addHeader(HttpHeaders.ContentType, ContentType.Application.FormUrlEncoded.toString())
                setBody(listOf("superficie" to "122.2","habitaciones" to "3","precio" to "12556.36","calle" to "Pedro Antorio","portal" to "3","piso" to "4","letra" to "F","propietario" to "Magdalena").formUrlEncode())
            }
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
                addHeader(HttpHeaders.ContentType, ContentType.Application.FormUrlEncoded.toString())
                setBody(listOf("superficie" to "122.2","habitaciones" to "3","precio" to "12556.36","calle" to "Pedro Antorio","portal" to "3","piso" to "4","letra" to "F","propietario" to "Magdalena").formUrlEncode())
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