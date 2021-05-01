import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import model.Student;

import java.util.List;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class App {

    private static final String URL = "http://localhost:8080/rest/students/";

    public static void main(String[] args) {
        Client client = Client.create();

        // CRUD - lab 2
        createStudent(client);
        printList(getStudentsBySurname(client, "Пупкин"));

        updateStudent(client);
        printList(getStudentsBySurname(client, "Перестукин"));

        deleteStudent(client);
        printList(getStudentsBySurname(client, "Перестукин"));
    }

    private static void createStudent(Client client) {
        WebResource webResource = client.resource(URL + "createStudent");
        webResource = webResource.queryParam("studentName", "Вася");
        webResource = webResource.queryParam("studentSurname", "Пупкин");
        webResource = webResource.queryParam("studentAge", String.valueOf(33));
        webResource = webResource.queryParam("studentGroupNumber", "P4111");
        webResource = webResource.queryParam("studentFaculty", "ПИиКТ");
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).post(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        GenericType<String> type = new GenericType<String>() {
        };
        System.out.println("New student was created with id = " + response.getEntity(type));
    }

    private static void updateStudent(Client client) {
        WebResource webResource = client.resource(URL + "updateStudent");
        webResource = webResource.queryParam("id", String.valueOf(1));
        webResource = webResource.queryParam("studentName", "Виктор");
        webResource = webResource.queryParam("studentSurname", "Перестукин");
        webResource = webResource.queryParam("studentAge", String.valueOf(18));
        webResource = webResource.queryParam("studentGroupNumber", "P4211");
        webResource = webResource.queryParam("studentFaculty", "ПИиКТ");

        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).put(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        GenericType<String> type = new GenericType<String>() {
        };
        System.out.println("The result of update = " + response.getEntity(type));
    }

    private static void deleteStudent(Client client) {
        WebResource webResource = client.resource(URL + "deleteStudent");
        webResource = webResource.queryParam("id", String.valueOf(1));

        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).delete(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        GenericType<String> type = new GenericType<String>() {
        };
        System.out.println("The result of delete = " + response.getEntity(type));
    }

    // Lab 1
    private static List<Student> getStudentsByName(Client client, String name) {
        WebResource webResource = client.resource(URL + "getStudentsByName");
        webResource = webResource.queryParam("studentName", name);
        return getStudents(webResource);
    }


    private static List<Student> getStudentsBySurname(Client client, String surname) {
        WebResource webResource = client.resource(URL + "getStudentsBySurname");
        webResource = webResource.queryParam("studentSurname", surname);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByAge(Client client, int age) {
        WebResource webResource = client.resource(URL + "getStudentsByAge");
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByGroupNumber(Client client, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsByGroupNumber");
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByFaculty(Client client, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByFaculty");
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurname(Client client, String name, String surname) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurname");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndAge(Client client, String name, int age) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndAge");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndGroupNumber(Client client, String name, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndGroupNumber");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndFaculty(Client client, String name, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndFaculty");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsBySurnameAndAge(Client client, String surname, int age) {
        WebResource webResource = client.resource(URL + "getStudentsBySurnameAndAge");
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        return getStudents(webResource);
    }

    private static List<Student> getStudentsBySurnameAndGroupNumber(Client client, String surname, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsBySurnameAndGroupNumber");
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsBySurnameAndFaculty(Client client, String surname, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsBySurnameAndFaculty");
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByAgeAndGroupNumber(Client client, int age, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsByAgeAndGroupNumber");
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByAgeAndFaculty(Client client, int age, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByAgeAndFaculty");
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByGroupNumberAndFaculty(Client client, String groupNumber, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByGroupNumberAndFaculty");
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndAge(Client client, String name, String surname, int age) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndAge");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndGroupNumber(Client client, String name, String surname, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndGroupNumber");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndFaculty(Client client, String name, String surname, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndFaculty");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsBySurnameAndAgeAndGroupNumber(Client client, String surname, int age, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsBySurnameAndAgeAndGroupNumber");
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsBySurnameAndAgeAndFaculty(Client client, String surname, int age, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsBySurnameAndAgeAndFaculty");
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByAgeAndGroupNumberAndFaculty(Client client, int age, String groupNumber, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByAgeAndGroupNumberAndFaculty");
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumber(Client client, String name, String surname, int age, String groupNumber) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndAgeAndGroupNumber");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndAgeAndFaculty(Client client, String name, String surname, int age, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndAgeAndFaculty");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndGroupNumberAndFaculty(Client client, String name, String surname, String groupNumber, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndGroupNumberAndFaculty");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndAgeAndGroupNumberAndFaculty(Client client, String name, int age, String groupNumber, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndAgeAndGroupNumberAndFaculty");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(Client client, String surname, int age, String groupNumber, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsBySurnameAndAgeAndGroupNumberAndFaculty");
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(Client client, String name, String surname, int age, String groupNumber, String faculty) {
        WebResource webResource = client.resource(URL + "getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty");
        webResource = webResource.queryParam("studentName", name);
        webResource = webResource.queryParam("studentSurname", surname);
        webResource = webResource.queryParam("studentAge", String.valueOf(age));
        webResource = webResource.queryParam("studentGroupNumber", groupNumber);
        webResource = webResource.queryParam("studentFaculty", faculty);
        return getStudents(webResource);
    }

    private static List<Student> getStudents(WebResource webResource) {
        ClientResponse response = webResource.accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
        if (response.getStatus() != ClientResponse.Status.OK.getStatusCode()) {
            throw new IllegalStateException("Request failed");
        }
        GenericType<List<Student>> type = new GenericType<List<Student>>() {
        };
        return response.getEntity(type);
    }

    private static void printList(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
