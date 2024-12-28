package routs

import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.testRoute(){
    route("/test"){
        get{
            call.respondText("GET HTTP verb OK")
        }
        post{
            call.respondText("POST HTTP verb OK")
        }
        delete{
            call.respondText("DELETE HTTP verb OK")
        }
    }
}