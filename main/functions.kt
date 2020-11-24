
package com.inmobiliv

import io.kotless.dsl.lang.http.Get

@Get("/")
fun serverless() = "InmobilIV Serverless Function"