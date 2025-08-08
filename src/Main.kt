package com.baidaidai.fetch

import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody

val clinit = OkHttpClient()

enum class HttpMethods(val names: String){
    post("POST"),
    get("GET"),
    put("PUT"),
    delete("DELETE"),
}

class HTTPOptions(){
    var methods:String = HttpMethods.get.names
    var body:RequestBody? = null

    fun methods(param_methods:HttpMethods?){
        methods = param_methods?.names ?: HttpMethods.get.names
    }
    fun body(bodies:String?){
        body = bodies?.trimIndent()?.toRequestBody()
    }
}

fun fetch(url: String, options: (HTTPOptions.() -> Unit)?):String{
    var responseBody:String
    val httpOptions = HTTPOptions()
    if(options!=null) httpOptions.options()

    val request = Request.Builder()
        .url(url)
        .header("Content-Type","application/json")
        .method(
            method = httpOptions.methods,
            body = httpOptions.body
        )
        .build()

    clinit.newCall(request)
        .execute()
        .use {
            responseBody = it.body?.string() ?: "Body is Void"
        }

    return responseBody
}