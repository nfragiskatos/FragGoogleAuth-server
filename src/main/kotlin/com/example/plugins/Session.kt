package com.example.plugins

import com.env.EnvConfig
import com.example.domain.model.UserSession
import io.ktor.server.application.*
import io.ktor.server.sessions.*
import io.ktor.util.*
import java.io.File

fun Application.configureSession() {
    install(Sessions) {
        cookie<UserSession>(
            name = "USER_SESSION",
            storage = directorySessionStorage(File(".sessions"))
        ) {
            transform(
                SessionTransportTransformerEncrypt(
                    hex(EnvConfig.SECRET_ENCRYPTION_KEY),
                    hex(EnvConfig.SECRET_AUTH_KEY)
                )
            )
        }
    }
}