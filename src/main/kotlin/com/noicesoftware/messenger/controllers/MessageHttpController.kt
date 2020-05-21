package com.noicesoftware.messenger.controllers

import com.noicesoftware.messenger.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.OffsetDateTime
import java.time.ZoneOffset
import java.util.*

@RestController
@RequestMapping("message")
class MessageHttpController {

    @GetMapping
    fun get(): Message {
        return Message(UUID.randomUUID(), OffsetDateTime.now().atZoneSameInstant(ZoneOffset.UTC),
                "anna", "bill", "Hello there!"
        )
    }
}