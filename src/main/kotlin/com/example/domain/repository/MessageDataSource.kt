package com.example.domain.repository

import com.example.domain.model.Message

interface MessageDataSource {

    suspend fun getAllMessages(): List<Message>
    suspend fun insertMessage(message: Message)
}