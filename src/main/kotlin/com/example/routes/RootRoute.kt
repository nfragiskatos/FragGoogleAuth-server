import com.example.domain.model.Endpoint.Root
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.rootRoute() {
    get(Root.path) {
        call.respondText("Welcome to ktor server")
    }
    
}