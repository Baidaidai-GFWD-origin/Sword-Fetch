package com.baidaidai.fetch

fun main() {
    val result = fetch("http://localhost:54321/index/recive"){
        methods(HttpMethods.post)
        body("""{
            "message":"hello from kotlin!"
        }""")
    }
    println(result)
}