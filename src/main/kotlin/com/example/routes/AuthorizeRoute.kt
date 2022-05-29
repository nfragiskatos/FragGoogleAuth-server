import com.example.domain.model.ApiResponse
import com.example.domain.model.Endpoint
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.authorizedRoute() {
    authenticate("auth-session") {
        post(Endpoint.Authorized.path) {
            call.respond(
                message = ApiResponse(success = true),
                status = HttpStatusCode.OK
            )
        }
    }
}