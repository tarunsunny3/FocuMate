package com.example.project4.network


import com.example.project4.response.ChatRequest
import com.example.project4.response.ChatResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiInterface {

    @POST("chat/completions")
    fun createChatCompletion(
        @Body chatRequest: ChatRequest,
        @Header("Content-Type") contentType: String = "application/json",
        @Header("Authorization") authorization: String,
    ): Call<ChatResponse>
}
