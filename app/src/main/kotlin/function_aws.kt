
package com.inmobiliv

import io.kotless.dsl.lang.http.Get

// Mensaje rapido de bienvenida
@Get("/")
fun serverless() = "InmobilIV Serverless Function v4" 

// Devuelve la informacion sobre Inmuebles
@Get("/json")
fun json(): String{

    var dataI = """
    {
        "inmuebles" : [
            {
                "superficie": 140.0,
                "habitaciones": 4,
                "precio": 30056.15,
                "vivienda": {
                    "calle": "Maestro Faus",
                    "portal": 4,
                    "piso": 1,
                    "letra": "D"
                },
                "propietario": "Josefo"
            },
            {
                "superficie": 452.6,
                "habitaciones": 5,
                "precio": 50000.69,
                "vivienda": {
                    "calle": "Pontezuelas",
                    "portal": 6,
                    "piso": 5,
                    "letra": "F"
                },
                "propietario": "Marijol"
            }
        ]   
    }"""

    return dataI
} 