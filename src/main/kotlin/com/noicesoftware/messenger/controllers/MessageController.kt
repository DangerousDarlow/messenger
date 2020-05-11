package com.noicesoftware.messenger.controllers

import com.noicesoftware.messenger.model.Message
import org.slf4j.Logger
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
class MessageController(val logger: Logger) {

    @MessageMapping("/text")
    fun receiveMessage(message: Message) {
        logger.info("received: $message")
    }
}