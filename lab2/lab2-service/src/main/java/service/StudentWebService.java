package service;

import dao.PostgreSqlDAO;
import model.Student;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.util.List;
import java.util.Map;

@WebService(serviceName = "StudentService")
public class StudentWebService {

    @Resource
    private WebServiceContext wsctx;

    private boolean chechAuth() {
        MessageContext mctx = wsctx.getMessageContext();

        Map http_headers = (Map) mctx.get(MessageContext.HTTP_REQUEST_HEADERS);
        List userList = (List) http_headers.get("Username");
        List passList = (List) http_headers.get("Password");

        String username = "";
        String password = "";

        if (userList != null) {
            username = userList.get(0).toString();
        }

        if (passList != null) {
            password = passList.get(0).toString();
        }

        if (username.equals("admin") && password.equals("admin")) {
            return true;
        } else {
            return false;
        }
    }

    // CRUD - lab 2
    @WebMethod(operationName = "createStudent")
    public Long createStudent(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) throws Exception {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        if (chechAuth()) {
            return dao.createStudent(name, surname, age, groupNumber, faculty);
        } else {
            throw new Exception("Access denied.");
        }
    }

    @WebMethod(operationName = "updateStudent")
    public boolean updateStudent(@WebParam(name = "id") Long id, @WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) throws Exception {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        if (chechAuth()) {
            return dao.updateStudent(id, name, surname, age, groupNumber, faculty);
        } else {
            throw new Exception("Access denied.");
        }
    }

    @WebMethod(operationName = "deleteStudent")
    public boolean deleteStudent(@WebParam(name = "id") Long id) throws Exception {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        if (chechAuth()) {
            return dao.deleteStudent(id);
        } else {
            throw new Exception("Access denied.");
        }
    }

    // Lab 1
    @WebMethod(operationName = "getStudentsByName")
    public List<Student> getStudentsByName(@WebParam(name = "studentName") String name) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByName(name);
    }

    @WebMethod(operationName = "getStudentsBySurname")
    public List<Student> getStudentsBySurname(@WebParam(name = "studentSurname") String surname) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurname(surname);
    }

    @WebMethod(operationName = "getStudentsByAge")
    public List<Student> getStudentsByAge(@WebParam(name = "studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByAge(age);
    }

    @WebMethod(operationName = "getStudentsByGroupNumber")
    public List<Student> getStudentsByGroupNumber(@WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByGroupNumber(groupNumber);
    }

    @WebMethod(operationName = "getStudentsByFaculty")
    public List<Student> getStudentsByFaculty(@WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByFaculty(faculty);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurname")
    public List<Student> getStudentsByNameAndSurname(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurname(name, surname);
    }

    @WebMethod(operationName = "getStudentsByNameAndAge")
    public List<Student> getStudentsByNameAndAge(@WebParam(name = "studentName") String name, @WebParam(name = "studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndAge(name, age);
    }

    @WebMethod(operationName = "getStudentsByNameAndGroupNumber")
    public List<Student> getStudentsByNameAndGroupNumber(@WebParam(name = "studentName") String name, @WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndGroupNumber(name, groupNumber);
    }

    @WebMethod(operationName = "getStudentsByNameAndFaculty")
    public List<Student> getStudentsByNameAndFaculty(@WebParam(name = "studentName") String name, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndFaculty(name, faculty);
    }

    @WebMethod(operationName = "getStudentsBySurnameAndAge")
    public List<Student> getStudentsBySurnameAndAge(@WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurnameAndAge(surname, age);
    }

    @WebMethod(operationName = "getStudentsBySurnameAndGroupNumber")
    public List<Student> getStudentsBySurnameAndGroupNumber(@WebParam(name = "studentSurname") String surname, @WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurnameAndGroupNumber(surname, groupNumber);
    }

    @WebMethod(operationName = "getStudentsBySurnameAndFaculty")
    public List<Student> getStudentsBySurnameAndFaculty(@WebParam(name = "studentSurname") String surname, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurnameAndFaculty(surname, faculty);
    }

    @WebMethod(operationName = "getStudentsByAgeAndGroupNumber")
    public List<Student> getStudentsByAgeAndGroupNumber(@WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByAgeAndGroupNumber(age, groupNumber);
    }

    @WebMethod(operationName = "getStudentsByAgeAndFaculty")
    public List<Student> getStudentsByAgeAndFaculty(@WebParam(name = "studentAge") int age, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByAgeAndFaculty(age, faculty);
    }

    @WebMethod(operationName = "getStudentsByGroupNumberAndFaculty")
    public List<Student> getStudentsByGroupNumberAndFaculty(@WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByGroupNumberAndFaculty(groupNumber, faculty);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndAge")
    public List<Student> getStudentsByNameAndSurnameAndAge(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndAge(name, surname, age);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndGroupNumber")
    public List<Student> getStudentsByNameAndSurnameAndGroupNumber(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndGroupNumber(name, surname, groupNumber);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndFaculty(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndFaculty(name, surname, faculty);
    }

    @WebMethod(operationName = "getStudentsBySurnameAndAgeAndGroupNumber")
    public List<Student> getStudentsBySurnameAndAgeAndGroupNumber(@WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurnameAndAgeAndGroupNumber(surname, age, groupNumber);
    }

    @WebMethod(operationName = "getStudentsBySurnameAndAgeAndFaculty")
    public List<Student> getStudentsBySurnameAndAgeAndFaculty(@WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurnameAndAgeAndFaculty(surname, age, faculty);
    }

    @WebMethod(operationName = "getStudentsByAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsByAgeAndGroupNumberAndFaculty(@WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByAgeAndGroupNumberAndFaculty(age, groupNumber, faculty);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndAgeAndGroupNumber")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumber(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndAgeAndGroupNumber(name, surname, age, groupNumber);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndAgeAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndFaculty(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndAgeAndFaculty(name, surname, age, faculty);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndGroupNumberAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndGroupNumberAndFaculty(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndGroupNumberAndFaculty(name, surname, groupNumber, faculty);
    }

    @WebMethod(operationName = "getStudentsByNameAndAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsByNameAndAgeAndGroupNumberAndFaculty(@WebParam(name = "studentName") String name, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndAgeAndGroupNumberAndFaculty(name, age, groupNumber, faculty);
    }

    @WebMethod(operationName = "getStudentsBySurnameAndAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(@WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(surname, age, groupNumber, faculty);
    }

    @WebMethod(operationName = "getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(name, surname, age, groupNumber, faculty);
    }
}
