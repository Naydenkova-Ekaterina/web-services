import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;

import java.net.URI;

import org.glassfish.grizzly.http.server.HttpServer;
import service.StudentResource;

public class App {

    private static final URI BASE_URI = URI.create("http://localhost:8080/rest/");

    public static void main(String[] args) {
        HttpServer server = null;
        try {
            ResourceConfig resourceConfig = new PackagesResourceConfig(StudentResource.class.getPackage().getName());
            resourceConfig.getProperties().put("com.sun.jersey.spi.container.ContainerRequestFilters",
                    "service.SecurityInterceptor");
            server = GrizzlyServerFactory.createHttpServer(BASE_URI, resourceConfig);
            server.start();
            System.in.read();
            stopServer(server);
        } catch (Exception e) {
            e.printStackTrace();
            stopServer(server);
        }
    }

    private static void stopServer(HttpServer server) {
        if (server != null)
            server.stop();
    }

}
