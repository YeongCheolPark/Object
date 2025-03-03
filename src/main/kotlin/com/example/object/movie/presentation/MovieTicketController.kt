package com.example.`object`.movie.presentation

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/movie/v1/tickets")
class MovieTicketController {
    @RequestMapping
    fun root(): String {
        return "Hello, World!"
    }

}