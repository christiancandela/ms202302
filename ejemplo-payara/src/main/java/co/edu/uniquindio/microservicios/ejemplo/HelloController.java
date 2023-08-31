package co.edu.uniquindio.microservicios.ejemplo;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

/**
 *
 */
@Path("/hello")
@Singleton
public class HelloController {

    @GET
    public String sayHello() {
        return "Hello World";
    }

    @GET
    @Path("/{nombre}")
    public String sayHello(@PathParam("nombre") String nombre) {
        return "Hello World "+nombre;
    }

}
