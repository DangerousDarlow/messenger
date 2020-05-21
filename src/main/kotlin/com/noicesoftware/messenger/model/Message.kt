package com.noicesoftware.messenger.model

import java.time.ZonedDateTime
import java.util.*

data class Message(
        val id: UUID,
        val timestamp: ZonedDateTime,
        val from: String,
        val to: String,
        val text: String
)