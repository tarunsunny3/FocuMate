package com.example.project4.response

data class ChatRequest(
    val messages: List<Message>,
    val model: String
)