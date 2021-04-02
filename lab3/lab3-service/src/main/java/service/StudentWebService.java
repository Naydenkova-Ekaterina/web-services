package service;

import dao.PostgreSqlDAO;
import exception.IllegalFieldException;
import exception.NotExistException;
import exception.StudentServiceFault;
import model.Student;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "StudentService")
public class StudentWebService {

    //Lab 3
    @WebMethod(operationName = "getStudentsByName")
    public List<Student> getStudentsByName(@WebParam(name = "studentName") String name) throws IllegalFieldException {
        if (name == null || name.trim().isEmpty()) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new IllegalFieldException("studentName is not specified", fault);
        }

        PostgreSqlDAO dao = new PostgreSqlDAO();
        return dao.getStudentsByName(name);
    }

    // Updated CRUD with exceptions
    @WebMethod(operationName = "createStudent")
    public Long createStudent(@WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) throws IllegalFieldException {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        checkFieldsCorrection(name, surname, age, groupNumber, faculty);

        return dao.createStudent(name, surname, age, groupNumber, faculty);
    }

    @WebMethod(operationName = "updateStudent")
    public boolean updateStudent(@WebParam(name = "id") Long id, @WebParam(name = "studentName") String name, @WebParam(name = "studentSurname") String surname, @WebParam(name = "studentAge") int age, @WebParam(name = "studentGroupNumber") String groupNumber, @WebParam(name = "studentFaculty") String faculty) throws NotExistException, IllegalFieldException {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        checkExistence(id);
        checkFieldsCorrection(name, surname, age, groupNumber, faculty);

        return dao.updateStudent(id, name, surname, age, groupNumber, faculty);
    }

    @WebMethod(operationName = "deleteStudent")
    public boolean deleteStudent(@WebParam(name = "id") Long id) throws NotExistException {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        checkExistence(id);
        return dao.deleteStudent(id);
    }

    private void checkExistence(Long id) throws NotExistException {
        PostgreSqlDAO dao = new PostgreSqlDAO();
        if (dao.getStudentsById(id) == null) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new NotExistException("Student with selected id doesn't exist.", fault);
        }
    }

    private void checkFieldsCorrection(String name, String surname, int age, String groupNumber, String faculty) throws IllegalFieldException {
        if (name == null || name.trim().isEmpty()) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new IllegalFieldException("studentName is not specified", fault);
        } else if (surname == null || surname.trim().isEmpty()) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new IllegalFieldException("studentSurname is not specified", fault);
        } else if (age <= 0 || age >= 150) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new IllegalFieldException("studentAge is not correct", fault);
        } else if (groupNumber == null || groupNumber.trim().isEmpty()) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new IllegalFieldException("studentGroupNumber is not specified", fault);
        } else if (faculty == null || faculty.trim().isEmpty()) {
            StudentServiceFault fault = StudentServiceFault.defaultInstance();
            throw new IllegalFieldException("studentFaculty is not specified", fault);
        }
    }

    // Lab 1

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
