package co.edu.uniquindio.microservicios.ejemplo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 *
 */
@ApplicationPath("/api")
@ApplicationScoped
public class EjemploRestApplication extends Application {
}
