
import service.Student;
import service.StudentService;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class WebServiceClient {

    public static void main(String[] args) throws MalformedURLException {
//        URL url = new URL("http://localhost:8080/lab1-service-j2ee-1.0-SNAPSHOT/StudentService?wsdl");
        URL url = new URL("http://localhost:8081/StudentService?wsdl");
        StudentService studentService = new StudentService(url);

        getStudentsByName(studentService);
        getStudentsBySurname(studentService);
        getStudentsByAge(studentService);
        getStudentsByGroupNumber(studentService);
        getStudentsByFaculty(studentService);
        getStudentsByNameAndSurname(studentService);
        getStudentsByNameAndAge(studentService);
        getStudentsByNameAndGroupNumber(studentService);
        getStudentsByNameAndFaculty(studentService);
        getStudentsBySurnameAndAge(studentService);
        getStudentsBySurnameAndGroupNumber(studentService);
        getStudentsBySurnameAndFaculty(studentService);
        getStudentsByAgeAndGroupNumber(studentService);
        getStudentsByAgeAndFaculty(studentService);
        getStudentsByGroupNumberAndFaculty(studentService);
        getStudentsByNameAndSurnameAndAge(studentService);
        getStudentsByNameAndSurnameAndGroupNumber(studentService);
        getStudentsByNameAndSurnameAndFaculty(studentService);
        getStudentsBySurnameAndAgeAndGroupNumber(studentService);
        getStudentsBySurnameAndAgeAndFaculty(studentService);
        getStudentsByAgeAndGroupNumberAndFaculty(studentService);
        getStudentsByNameAndSurnameAndAgeAndGroupNumber(studentService);
        getStudentsByNameAndSurnameAndAgeAndFaculty(studentService);
        getStudentsByNameAndSurnameAndGroupNumberAndFaculty(studentService);
        getStudentsByNameAndAgeAndGroupNumberAndFaculty(studentService);
        getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(studentService);
        getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(studentService);
    }

    private static void getStudentsByName(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByName("Владимир");
        printResult(students);
    }

    private static void getStudentsBySurname(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurname("Иванов");
        printResult(students);
    }

    private static void getStudentsByAge(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByAge(26);
        printResult(students);
    }

    private static void getStudentsByGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByGroupNumber("P41142");
        printResult(students);
    }

    private static void getStudentsByFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByFaculty("ИКТ");
        printResult(students);
    }

    private static void getStudentsByNameAndSurname(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurname("Владимир", "Иванов");
        printResult(students);
    }

    private static void getStudentsByNameAndAge(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndAge("Владимир", 26);
        printResult(students);
    }

    private static void getStudentsByNameAndGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndGroupNumber("Владимир", "P41142");
        printResult(students);
    }

    private static void getStudentsByNameAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndFaculty("Владимир", "ИКТ");
        printResult(students);
    }

    private static void getStudentsBySurnameAndAge(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurnameAndAge("Иванов", 26);
        printResult(students);
    }

    private static void getStudentsBySurnameAndGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurnameAndGroupNumber("Иванов", "P41142");
        printResult(students);
    }

    private static void getStudentsBySurnameAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurnameAndFaculty("Иванов", "ИКТ");
        printResult(students);
    }

    private static void getStudentsByAgeAndGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByAgeAndGroupNumber(26, "P41142");
        printResult(students);
    }

    private static void getStudentsByAgeAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByAgeAndFaculty(26, "ИКТ");
        printResult(students);
    }

    private static void getStudentsByGroupNumberAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByGroupNumberAndFaculty("P41142", "ИКТ");
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndAge(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndAge("Владимир", "Иванов", 26);
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndGroupNumber("Владимир", "Иванов", "P41142");
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndFaculty("Владимир", "Иванов", "ИКТ");
        printResult(students);
    }

    private static void getStudentsBySurnameAndAgeAndGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurnameAndAgeAndGroupNumber("Иванов", 26, "P41142");
        printResult(students);
    }

    private static void getStudentsBySurnameAndAgeAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurnameAndAgeAndFaculty("Иванов", 26, "ИКТ");
        printResult(students);
    }

    private static void getStudentsByAgeAndGroupNumberAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByAgeAndGroupNumberAndFaculty(26, "P41142", "ИКТ");
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndAgeAndGroupNumber(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndAgeAndGroupNumber("Владимир", "Иванов", 26, "P41142");
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndAgeAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndAgeAndFaculty("Владимир", "Иванов", 26, "ИКТ");
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndGroupNumberAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndGroupNumberAndFaculty("Владимир", "Иванов", "P41142", "ИКТ");
        printResult(students);
    }

    private static void getStudentsByNameAndAgeAndGroupNumberAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndAgeAndGroupNumberAndFaculty("Владимир", 26, "P41142", "ИКТ");
        printResult(students);
    }

    private static void getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsBySurnameAndAgeAndGroupNumberAndFaculty("Иванов", 26, "P41142", "ИКТ");
        printResult(students);
    }

    private static void getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(StudentService studentService) {
        List<Student> students = studentService.getStudentWebServicePort().getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty("Владимир", "Иванов", 26, "P41142", "ИКТ");
        printResult(students);
    }

    private static void printResult(List<Student> students) {
        for (Student student : students) {
            System.out.println("name: " + student.getName() +
                    ", surname: " + student.getSurname() + ", age: " + student.getAge()
                    + ", groupNumber: " + student.getGroupNumber() + ", faculty: " + student.getFaculty()
            );
        }
        System.out.println("Total students: " + students.size());
    }

}
