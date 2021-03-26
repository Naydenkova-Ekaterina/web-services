
package service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StudentWebService", targetNamespace = "http://service/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StudentWebService {


    /**
     * 
     * @param studentGroupNumber
     * @param studentSurname
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndGroupNumberAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndGroupNumberAndFaculty")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndGroupNumberAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndGroupNumberAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndGroupNumberAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndGroupNumberAndFacultyResponse")
    public List<Student> getStudentsByNameAndSurnameAndGroupNumberAndFaculty(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentSurname
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurnameAndAgeAndGroupNumberAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeAndGroupNumberAndFaculty")
    @ResponseWrapper(localName = "getStudentsBySurnameAndAgeAndGroupNumberAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeAndGroupNumberAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameAndAgeAndGroupNumberAndFacultyRequest", output = "http://service/StudentWebService/getStudentsBySurnameAndAgeAndGroupNumberAndFacultyResponse")
    public List<Student> getStudentsBySurnameAndAgeAndGroupNumberAndFaculty(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentSurname
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeAndGroupNumberAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFacultyResponse")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumberAndFaculty(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentSurname
     * @param studentName
     * @param id
     * @param studentFaculty
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateStudent", targetNamespace = "http://service/", className = "service.UpdateStudent")
    @ResponseWrapper(localName = "updateStudentResponse", targetNamespace = "http://service/", className = "service.UpdateStudentResponse")
    @Action(input = "http://service/StudentWebService/updateStudentRequest", output = "http://service/StudentWebService/updateStudentResponse")
    public boolean updateStudent(
        @WebParam(name = "id", targetNamespace = "")
        Long id,
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentAge
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByAge", targetNamespace = "http://service/", className = "service.GetStudentsByAge")
    @ResponseWrapper(localName = "getStudentsByAgeResponse", targetNamespace = "http://service/", className = "service.GetStudentsByAgeResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByAgeRequest", output = "http://service/StudentWebService/getStudentsByAgeResponse")
    public List<Student> getStudentsByAge(
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge);

    /**
     * 
     * @param id
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteStudent", targetNamespace = "http://service/", className = "service.DeleteStudent")
    @ResponseWrapper(localName = "deleteStudentResponse", targetNamespace = "http://service/", className = "service.DeleteStudentResponse")
    @Action(input = "http://service/StudentWebService/deleteStudentRequest", output = "http://service/StudentWebService/deleteStudentResponse")
    public boolean deleteStudent(
        @WebParam(name = "id", targetNamespace = "")
        Long id);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentSurname
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.lang.Long
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "createStudent", targetNamespace = "http://service/", className = "service.CreateStudent")
    @ResponseWrapper(localName = "createStudentResponse", targetNamespace = "http://service/", className = "service.CreateStudentResponse")
    @Action(input = "http://service/StudentWebService/createStudentRequest", output = "http://service/StudentWebService/createStudentResponse")
    public Long createStudent(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentSurname
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndFaculty")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndFacultyResponse")
    public List<Student> getStudentsByNameAndSurnameAndFaculty(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentAge
     * @param studentSurname
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndAgeAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeAndFaculty")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndAgeAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeAndFacultyResponse")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndFaculty(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByAgeAndGroupNumberAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByAgeAndGroupNumberAndFaculty")
    @ResponseWrapper(localName = "getStudentsByAgeAndGroupNumberAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByAgeAndGroupNumberAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByAgeAndGroupNumberAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByAgeAndGroupNumberAndFacultyResponse")
    public List<Student> getStudentsByAgeAndGroupNumberAndFaculty(
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentSurname
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndAgeAndGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeAndGroupNumber")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndAgeAndGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeAndGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeAndGroupNumberRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeAndGroupNumberResponse")
    public List<Student> getStudentsByNameAndSurnameAndAgeAndGroupNumber(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentGroupNumber
     * @param studentSurname
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurnameAndGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndGroupNumber")
    @ResponseWrapper(localName = "getStudentsBySurnameAndGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameAndGroupNumberRequest", output = "http://service/StudentWebService/getStudentsBySurnameAndGroupNumberResponse")
    public List<Student> getStudentsBySurnameAndGroupNumber(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentGroupNumber
     * @param studentSurname
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndGroupNumber")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndGroupNumberRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndGroupNumberResponse")
    public List<Student> getStudentsByNameAndSurnameAndGroupNumber(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentAge
     * @param studentSurname
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurnameAndAgeAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeAndFaculty")
    @ResponseWrapper(localName = "getStudentsBySurnameAndAgeAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameAndAgeAndFacultyRequest", output = "http://service/StudentWebService/getStudentsBySurnameAndAgeAndFacultyResponse")
    public List<Student> getStudentsBySurnameAndAgeAndFaculty(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndAgeAndGroupNumberAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndAgeAndGroupNumberAndFaculty")
    @ResponseWrapper(localName = "getStudentsByNameAndAgeAndGroupNumberAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndAgeAndGroupNumberAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndAgeAndGroupNumberAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByNameAndAgeAndGroupNumberAndFacultyResponse")
    public List<Student> getStudentsByNameAndAgeAndGroupNumberAndFaculty(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @param studentSurname
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurnameAndAgeAndGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeAndGroupNumber")
    @ResponseWrapper(localName = "getStudentsBySurnameAndAgeAndGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeAndGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameAndAgeAndGroupNumberRequest", output = "http://service/StudentWebService/getStudentsBySurnameAndAgeAndGroupNumberResponse")
    public List<Student> getStudentsBySurnameAndAgeAndGroupNumber(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentAge
     * @param studentSurname
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurnameAndAge", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAge")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameAndAgeResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameAndAgeResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameAndAgeResponse")
    public List<Student> getStudentsByNameAndSurnameAndAge(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge);

    /**
     * 
     * @param studentGroupNumber
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByGroupNumberAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByGroupNumberAndFaculty")
    @ResponseWrapper(localName = "getStudentsByGroupNumberAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByGroupNumberAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByGroupNumberAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByGroupNumberAndFacultyResponse")
    public List<Student> getStudentsByGroupNumberAndFaculty(
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentSurname
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurname", targetNamespace = "http://service/", className = "service.GetStudentsBySurname")
    @ResponseWrapper(localName = "getStudentsBySurnameResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameRequest", output = "http://service/StudentWebService/getStudentsBySurnameResponse")
    public List<Student> getStudentsBySurname(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname);

    /**
     * 
     * @param studentSurname
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurnameAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndFaculty")
    @ResponseWrapper(localName = "getStudentsBySurnameAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameAndFacultyRequest", output = "http://service/StudentWebService/getStudentsBySurnameAndFacultyResponse")
    public List<Student> getStudentsBySurnameAndFaculty(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @param studentAge
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByAgeAndGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsByAgeAndGroupNumber")
    @ResponseWrapper(localName = "getStudentsByAgeAndGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsByAgeAndGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByAgeAndGroupNumberRequest", output = "http://service/StudentWebService/getStudentsByAgeAndGroupNumberResponse")
    public List<Student> getStudentsByAgeAndGroupNumber(
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByFaculty")
    @ResponseWrapper(localName = "getStudentsByFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByFacultyRequest", output = "http://service/StudentWebService/getStudentsByFacultyResponse")
    public List<Student> getStudentsByFaculty(
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentGroupNumber
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsByGroupNumber")
    @ResponseWrapper(localName = "getStudentsByGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsByGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByGroupNumberRequest", output = "http://service/StudentWebService/getStudentsByGroupNumberResponse")
    public List<Student> getStudentsByGroupNumber(
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentSurname
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndSurname", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurname")
    @ResponseWrapper(localName = "getStudentsByNameAndSurnameResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndSurnameResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndSurnameRequest", output = "http://service/StudentWebService/getStudentsByNameAndSurnameResponse")
    public List<Student> getStudentsByNameAndSurname(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname);

    /**
     * 
     * @param studentName
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndFaculty")
    @ResponseWrapper(localName = "getStudentsByNameAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByNameAndFacultyResponse")
    public List<Student> getStudentsByNameAndFaculty(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByName", targetNamespace = "http://service/", className = "service.GetStudentsByName")
    @ResponseWrapper(localName = "getStudentsByNameResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameRequest", output = "http://service/StudentWebService/getStudentsByNameResponse")
    public List<Student> getStudentsByName(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName);

    /**
     * 
     * @param studentAge
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndAge", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndAge")
    @ResponseWrapper(localName = "getStudentsByNameAndAgeResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndAgeResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndAgeRequest", output = "http://service/StudentWebService/getStudentsByNameAndAgeResponse")
    public List<Student> getStudentsByNameAndAge(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge);

    /**
     * 
     * @param studentGroupNumber
     * @param studentName
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByNameAndGroupNumber", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndGroupNumber")
    @ResponseWrapper(localName = "getStudentsByNameAndGroupNumberResponse", targetNamespace = "http://service/", className = "service.GetStudentsByNameAndGroupNumberResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByNameAndGroupNumberRequest", output = "http://service/StudentWebService/getStudentsByNameAndGroupNumberResponse")
    public List<Student> getStudentsByNameAndGroupNumber(
        @WebParam(name = "studentName", targetNamespace = "")
        String studentName,
        @WebParam(name = "studentGroupNumber", targetNamespace = "")
        String studentGroupNumber);

    /**
     * 
     * @param studentAge
     * @param studentFaculty
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsByAgeAndFaculty", targetNamespace = "http://service/", className = "service.GetStudentsByAgeAndFaculty")
    @ResponseWrapper(localName = "getStudentsByAgeAndFacultyResponse", targetNamespace = "http://service/", className = "service.GetStudentsByAgeAndFacultyResponse")
    @Action(input = "http://service/StudentWebService/getStudentsByAgeAndFacultyRequest", output = "http://service/StudentWebService/getStudentsByAgeAndFacultyResponse")
    public List<Student> getStudentsByAgeAndFaculty(
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge,
        @WebParam(name = "studentFaculty", targetNamespace = "")
        String studentFaculty);

    /**
     * 
     * @param studentAge
     * @param studentSurname
     * @return
     *     returns java.util.List<service.Student>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getStudentsBySurnameAndAge", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAge")
    @ResponseWrapper(localName = "getStudentsBySurnameAndAgeResponse", targetNamespace = "http://service/", className = "service.GetStudentsBySurnameAndAgeResponse")
    @Action(input = "http://service/StudentWebService/getStudentsBySurnameAndAgeRequest", output = "http://service/StudentWebService/getStudentsBySurnameAndAgeResponse")
    public List<Student> getStudentsBySurnameAndAge(
        @WebParam(name = "studentSurname", targetNamespace = "")
        String studentSurname,
        @WebParam(name = "studentAge", targetNamespace = "")
        int studentAge);

}
