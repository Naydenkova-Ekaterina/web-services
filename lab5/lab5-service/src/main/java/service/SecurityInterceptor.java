package service;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ws.rs.WebApplicationException;

import com.sun.jersey.spi.container.ContainerRequest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.DatatypeConverter;

import com.sun.jersey.spi.container.ContainerRequestFilter;

@Provider
public class SecurityInterceptor implements ContainerRequestFilter {

    Logger logger = Logger.getLogger("SecurityInterceptor");
    private static final String username = "admin";
    private static final String password = "admin";

    @Override
    public ContainerRequest filter(ContainerRequest containerRequest) throws WebApplicationException {
        String method = containerRequest.getMethod();
        logger.log(Level.INFO, "method = " + method);
        String path = containerRequest.getPath(true);
        logger.log(Level.INFO, "path = " + path);

        if (method.equals("GET")) {
            return containerRequest;
        }
        if ((path.equals("students/createStudent") && method.equals("POST")) ||
                (path.equals("students/updateStudent") && method.equals("PUT")) ||
                (path.equals("students/deleteStudent") && method.equals("DELETE"))) {
            String auth = containerRequest.getHeaderValue("authorization");
            logger.log(Level.INFO, "auth = " + auth);

            if (auth == null) {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }

            String[] lap = decode(auth);

            if (lap == null || lap.length != 2) {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }

            logger.log(Level.INFO, "lap[0]" + lap[0]);
            logger.log(Level.INFO, "lap[1]" + lap[1]);
            if (lap[0].equals(username) && lap[1].equals(password)) {
                return containerRequest;
            } else {
                throw new WebApplicationException(Response.Status.UNAUTHORIZED);
            }
        } else {
            throw new WebApplicationException(Response.Status.UNAUTHORIZED);
        }
    }

    private static String[] decode(String auth) {
        auth = auth.replaceFirst("Basic ", "");

        byte[] decodedBytes = DatatypeConverter.parseBase64Binary(auth);

        if (decodedBytes == null || decodedBytes.length == 0) {
            return null;
        }

        return new String(decodedBytes).split(":", 2);
    }
}