package com.example.plugins

import com.example.routes.unauthorizedRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import rootRoute

fun Application.configureRouting() {

    routing {
        rootRoute()
        unauthorizedRoute()
    }
}