package com.germanfica.wsfe.model.soap.envelope;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoapFault", propOrder = {
        "faultcode",
        "faultstring",
        "detail"
})
public class SoapFault {

    @XmlElement(required = true)
    protected String faultcode;
    @XmlElement(required = true)
    protected String faultstring;
    @XmlElement(required = true)
    protected FaultDetail detail;

    /**
     * Gets the value of the faultcode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultcode() {
        return faultcode;
    }

    /**
     * Sets the value of the faultcode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultcode(String value) {
        this.faultcode = value;
    }

    /**
     * Gets the value of the faultstring property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFaultstring() {
        return faultstring;
    }

    /**
     * Sets the value of the faultstring property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFaultstring(String value) {
        this.faultstring = value;
    }

    /**
     * Gets the value of the detail property.
     *
     * @return
     *     possible object is
     *     {@link FaultDetail }
     *
     */
    public FaultDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     *
     * @param value
     *     allowed object is
     *     {@link FaultDetail }
     *
     */
    public void setDetail(FaultDetail value) {
        this.detail = value;
    }

}
