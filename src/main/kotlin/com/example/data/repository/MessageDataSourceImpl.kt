package com.example.data.repository

import com.example.domain.model.Message
import com.example.domain.repository.MessageDataSource
import org.litote.kmongo.coroutine.CoroutineDatabase

class MessageDataSourceImpl
    (private val dataBase: CoroutineDatabase) : MessageDataSource {

    private val messages = dataBase.getCollection<Message>()

    override suspend fun getAllMessages(): List<Message> {
        return messages.find()
            .descendingSort(Message::timeStamp)
            .toList()
    }

    override suspend fun insertMessage(message: Message) {
        messages.insertOne(message)
    }
}