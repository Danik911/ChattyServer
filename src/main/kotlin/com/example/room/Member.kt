package com.example.room

import java.net.http.WebSocket

data class Member(
    val name: String,
    val sessionId: String,
    val webSocket: WebSocket
)
