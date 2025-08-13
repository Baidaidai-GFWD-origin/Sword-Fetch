package com.baidaidai.fetch

fun main() {
    val result = fetch("http://localhost:54321/index/recive"){
        methods(HttpMethods.post)
        head {
            add("Content-Type","application/json")
        }
        body("""{
            "name":"Nick",
            "greeting":"Say Hello From Kotlin"
        }""")
    }
    println(result)
}