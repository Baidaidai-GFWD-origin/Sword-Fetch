package com.baidaidai.fetch

import kotlinx.serialization.json.*
import okhttp3.*
import okhttp3.RequestBody.Companion.toRequestBody

val json = Json
val clinit = OkHttpClient()

enum class HttpMethods(val names: String){
    post("POST"),
    get("GET"),
    put("PUT"),
    delete("DELETE"),
}

class HTTPOptions(content: String){
    private var _value:JsonObject;
    init {
        // 如果用户本身传入的就是非法Json，则会直接报错
        _value = json.parseToJsonElement(content).jsonObject
    }

    val methods:String = getMethods(_value["methods"])
    val head:JsonElement? = _value["head"]
    val body: RequestBody? = _value["body"].toString().toRequestBody()

    private fun getMethods(param:JsonElement?):String{
        val _method = param!!.jsonPrimitive.content
        val result = when(_method){
            HttpMethods.post.names -> HttpMethods.post.names
            HttpMethods.get.names -> HttpMethods.get.names
            HttpMethods.put.names -> HttpMethods.put.names
            HttpMethods.delete.names -> HttpMethods.delete.names
            else -> HttpMethods.get.names
        }
        return result
    }
}

fun fetch( url:String, options:HTTPOptions? = null):String{
    var responseBody:String


    val request = Request.Builder()
        .url(url)
        .header("Content-Type","application/json")
        .method(
            method = options?.methods ?: HttpMethods.get.names,
            body = options?.body
        )
        .build()

    clinit.newCall(request)
        .execute()
        .use {
            responseBody = it.body!!.string()
        }

    return responseBody
}