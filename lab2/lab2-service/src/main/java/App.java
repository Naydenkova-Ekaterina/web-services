import service.StudentWebService;

import javax.xml.ws.Endpoint;

public class App {

    public static void main(String[] args) {
        String url = "http://0.0.0.0:8081/StudentService";
        Endpoint.publish(url, new StudentWebService());
    }
}
