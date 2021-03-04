
package ru.javaops.masterjava.xml.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element ref="{http://javaops.ru}UserRef"/>
 *       &lt;/sequence>
 *       &lt;attribute name="status" use="required" type="{http://javaops.ru}groupStatus" />
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userRef"
})
@XmlRootElement(name = "Group", namespace = "http://javaops.ru")
public class Group {

    @XmlElement(name = "UserRef", namespace = "http://javaops.ru", required = true)
    protected List<UserRef> userRef;
    @XmlAttribute(name = "status", required = true)
    protected GroupStatus status;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the userRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserRef }
     * 
     * 
     */
    public List<UserRef> getUserRef() {
        if (userRef == null) {
            userRef = new ArrayList<UserRef>();
        }
        return this.userRef;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link GroupStatus }
     *     
     */
    public GroupStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupStatus }
     *     
     */
    public void setStatus(GroupStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
