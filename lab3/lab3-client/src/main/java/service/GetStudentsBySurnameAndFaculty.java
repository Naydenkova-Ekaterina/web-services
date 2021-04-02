
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStudentsBySurnameAndFaculty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStudentsBySurnameAndFaculty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "getStudentsBySurnameAndFaculty", propOrder = {
    "studentSurname",
    "studentFaculty"
})
public class GetStudentsBySurnameAndFaculty {

    protected String studentSurname;
    protected String studentFaculty;

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
