//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.10 at 05:37:37 PM EET 
//


package test.client.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idqq" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="last_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="first_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mid_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="job_position" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personal_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passport_series" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passport_number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idqq",
    "lastName",
    "firstName",
    "midName",
    "jobPosition",
    "personalNumber",
    "passportSeries",
    "passportNumber",
    "salary"
})
@XmlRootElement(name = "client")
public class Client {

    protected int idqq;
    @XmlElement(name = "last_name", required = true)
    protected String lastName;
    @XmlElement(name = "first_name", required = true)
    protected String firstName;
    @XmlElement(name = "mid_name", required = true)
    protected String midName;
    @XmlElement(name = "job_position", required = true)
    protected String jobPosition;
    @XmlElement(name = "personal_number", required = true)
    protected String personalNumber;
    @XmlElement(name = "passport_series", required = true)
    protected String passportSeries;
    @XmlElement(name = "passport_number", required = true)
    protected String passportNumber;
    protected int salary;

    /**
     * Gets the value of the idqq property.
     * 
     */
    public int getIdqq() {
        return idqq;
    }

    /**
     * Sets the value of the idqq property.
     * 
     */
    public void setIdqq(int value) {
        this.idqq = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the midName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidName() {
        return midName;
    }

    /**
     * Sets the value of the midName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidName(String value) {
        this.midName = value;
    }

    /**
     * Gets the value of the jobPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobPosition() {
        return jobPosition;
    }

    /**
     * Sets the value of the jobPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobPosition(String value) {
        this.jobPosition = value;
    }

    /**
     * Gets the value of the personalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalNumber() {
        return personalNumber;
    }

    /**
     * Sets the value of the personalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalNumber(String value) {
        this.personalNumber = value;
    }

    /**
     * Gets the value of the passportSeries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportSeries() {
        return passportSeries;
    }

    /**
     * Sets the value of the passportSeries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportSeries(String value) {
        this.passportSeries = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     */
    public int getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     */
    public void setSalary(int value) {
        this.salary = value;
    }

}
