package service;

import dao.PostgreSqlDAO;
import model.Student;

import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@RequestScoped
@Path("/students")
@Produces({MediaType.APPLICATION_JSON})
public class StudentResource {

    @Resource(lookup = "jdbc/ifmo-ws")
    private DataSource dataSource;

    @GET
    @Path("/getStudentsByName")
    public List<Student> getStudentsByName(@QueryParam("studentName") String name) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByName(name);
    }

    @GET
    @Path("/getStudentsBySurname")
    public List<Student> getStudentsBySurname(@QueryParam("studentSurname") String surname) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurname(surname);
    }

    @GET
    @Path("/getStudentsByAge")
    public List<Student> getStudentsByAge(@QueryParam("studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByAge(age);
    }

    @GET
    @Path("/getStudentsByGroupNumber")
    public List<Student> getStudentsByGroupNumber(@QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByGroupNumber(groupNumber);
    }

    @GET
    @Path("/getStudentsByFaculty")
    public List<Student> getStudentsByFaculty(@QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByFaculty(faculty);
    }

    @GET
    @Path("/getStudentsByNameAndSurname")
    public List<Student> getStudentsByNameAndSurname(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurname(name, surname);
    }

    @GET
    @Path("/getStudentsByNameAndAge")
    public List<Student> getStudentsByNameAndAge(@QueryParam("studentName") String name, @QueryParam("studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndAge(name, age);
    }

    @GET
    @Path("/getStudentsByNameAndGroupNumber")
    public List<Student> getStudentsByNameAndGroupNumber(@QueryParam("studentName") String name, @QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndGroupNumber(name, groupNumber);
    }

    @GET
    @Path("/getStudentsByNameAndFaculty")
    public List<Student> getStudentsByNameAndFaculty(@QueryParam("studentName") String name, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndFaculty(name, faculty);
    }

    @GET
    @Path("/getStudentsBySurnameAndAge")
    public List<Student> getStudentsBySurnameAndAge(@QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurnameAndAge(surname, age);
    }

    @GET
    @Path("/getStudentsBySurnameAndGroupNumber")
    public List<Student> getStudentsBySurnameAndGroupNumber(@QueryParam("studentSurname") String surname, @QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurnameAndGroupNumber(surname, groupNumber);
    }

    @GET
    @Path("/getStudentsBySurnameAndFaculty")
    public List<Student> getStudentsBySurnameAndFaculty(@QueryParam("studentSurname") String surname, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurnameAndFaculty(surname, faculty);
    }

    @GET
    @Path("/getStudentsByAgeAndGroupNumber")
    public List<Student> getStudentsByAgeAndGroupNumber(@QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByAgeAndGroupNumber(age, groupNumber);
    }

    @GET
    @Path("/getStudentsByAgeAndFaculty")
    public List<Student> getStudentsByAgeAndFaculty(@QueryParam("studentAge") int age, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByAgeAndFaculty(age, faculty);
    }

    @GET
    @Path("/getStudentsByGroupNumberAndFaculty")
    public List<Student> getStudentsByGroupNumberAndFaculty(@QueryParam("studentGroupNumber") String groupNumber, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByGroupNumberAndFaculty(groupNumber, faculty);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndAge")
    public List<Student> getStudentsByNameAndSurnameAndAge(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndAge(name, surname, age);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndGroupNumber")
    public List<Student> getStudentsByNameAndSurnameAndGroupNumber(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndGroupNumber(name, surname, groupNumber);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndFaculty(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndFaculty(name, surname, faculty);
    }

    @GET
    @Path("/getStudentsBySurnameAndAgeAndGroupNumber")
    public List<Student> getStudentsBySurnameAndAgeAndGroupNumber(@QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurnameAndAgeAndGroupNumber(surname, age, groupNumber);
    }

    @GET
    @Path("/getStudentsBySurnameAndAgeAndFaculty")
    public List<Student> getStudentsBySurnameAndAgeAndFaculty(@QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurnameAndAgeAndFaculty(surname, age, faculty);
    }

    @GET
    @Path("/getStudentsByAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsByAgeAndGroupNumberAndFaculty(@QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByAgeAndGroupNumberAndFaculty(age, groupNumber, faculty);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndAgeAndGroupNumber")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumber(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndAgeAndGroupNumber(name, surname, age, groupNumber);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndAgeAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndFaculty(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndAgeAndFaculty(name, surname, age, faculty);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndGroupNumberAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndGroupNumberAndFaculty(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentGroupNumber") String groupNumber, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndGroupNumberAndFaculty(name, surname, groupNumber, faculty);
    }

    @GET
    @Path("/getStudentsByNameAndAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsByNameAndAgeAndGroupNumberAndFaculty(@QueryParam("studentName") String name, @QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndAgeAndGroupNumberAndFaculty(name, age, groupNumber, faculty);
    }

    @GET
    @Path("/getStudentsBySurnameAndAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(@QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(surname, age, groupNumber, faculty);
    }

    @GET
    @Path("/getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(@QueryParam("studentName") String name, @QueryParam("studentSurname") String surname, @QueryParam("studentAge") int age, @QueryParam("studentGroupNumber") String groupNumber, @QueryParam("studentFaculty") String faculty) {
        PostgreSqlDAO dao = new PostgreSqlDAO(getConnection());
        return dao.getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(name, surname, age, groupNumber, faculty);
    }

    private Connection getConnection() {
        Connection result = null;
        try {
            result = dataSource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(StudentResource.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
