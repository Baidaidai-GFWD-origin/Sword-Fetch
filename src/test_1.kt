package com.baidaidai.fetch

import kotlinx.coroutines.runBlocking

fun main() {
    val options = HTTPOptions("""
        {
            "methods":"POST",
            "body":{
                "message":"Sending From Kotlin!"
            }
        }
    """.trimIndent())
    val result = fetch("http://localhost:54321/index/random")
    println(result)
}