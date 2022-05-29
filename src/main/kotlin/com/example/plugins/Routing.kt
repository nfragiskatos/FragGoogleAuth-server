package com.example.plugins

import authorizedRoute
import com.example.routes.tokenVerificationRoute
import com.example.routes.unauthorizedRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*
import rootRoute

fun Application.configureRouting() {

    routing {
        rootRoute()
        tokenVerificationRoute()
        authorizedRoute()
        unauthorizedRoute()
    }
}