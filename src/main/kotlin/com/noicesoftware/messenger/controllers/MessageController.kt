package com.noicesoftware.messenger.controllers

import org.slf4j.Logger
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.stereotype.Controller

@Controller
class MessageController(val logger: Logger) {

    @MessageMapping("/text")
    fun receiveMessage(message: String) {
        logger.info("received: $message")
    }
}