package com.example.plugins

import authorizedRoute
import com.example.domain.repository.UserDataSource
import com.example.routes.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import org.koin.java.KoinJavaComponent.inject
import rootRoute

fun Application.configureRouting() {

    routing {
        val userDataSource: UserDataSource by inject(UserDataSource::class.java)
        rootRoute()
        tokenVerificationRoute(application, userDataSource)
        getUserInfoRoute(application, userDataSource)
        updateUserInfoRoute(application, userDataSource)
        deleteUserRoute(application, userDataSource)
        authorizedRoute()
        unauthorizedRoute()
    }
}