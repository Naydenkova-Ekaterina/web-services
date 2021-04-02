
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateStudent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateStudent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="studentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="studentGroupNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentFaculty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateStudent", propOrder = {
    "id",
    "studentName",
    "studentSurname",
    "studentAge",
    "studentGroupNumber",
    "studentFaculty"
})
public class UpdateStudent {

    protected Long id;
    protected String studentName;
    protected String studentSurname;
    protected int studentAge;
    protected String studentGroupNumber;
    protected String studentFaculty;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the studentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Sets the value of the studentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentName(String value) {
        this.studentName = value;
    }

    /**
     * Gets the value of the studentSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentSurname() {
        return studentSurname;
    }

    /**
     * Sets the value of the studentSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentSurname(String value) {
        this.studentSurname = value;
    }

    /**
     * Gets the value of the studentAge property.
     * 
     */
    public int getStudentAge() {
        return studentAge;
    }

    /**
     * Sets the value of the studentAge property.
     * 
     */
    public void setStudentAge(int value) {
        this.studentAge = value;
    }

    /**
     * Gets the value of the studentGroupNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentGroupNumber() {
        return studentGroupNumber;
    }

    /**
     * Sets the value of the studentGroupNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentGroupNumber(String value) {
        this.studentGroupNumber = value;
    }

    /**
     * Gets the value of the studentFaculty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentFaculty() {
        return studentFaculty;
    }

    /**
     * Sets the value of the studentFaculty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentFaculty(String value) {
        this.studentFaculty = value;
    }

}
