package com.example.domain.model

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val message: String,
    val userName: String,
    val timeStamp: Long,
    @BsonId
    val messageId: String = ObjectId().toString()
)
