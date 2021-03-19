
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getStudentsByGroupNumberAndFaculty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getStudentsByGroupNumberAndFaculty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "getStudentsByGroupNumberAndFaculty", propOrder = {
    "studentGroupNumber",
    "studentFaculty"
})
public class GetStudentsByGroupNumberAndFaculty {

    protected String studentGroupNumber;
    protected String studentFaculty;

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
