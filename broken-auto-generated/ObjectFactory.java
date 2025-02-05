//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2025.01.19 at 03:23:41 AM ART 
//


package org.xmlsoap.schemas.soap.envelope;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.xmlsoap.schemas.soap.envelope package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Envelope_QNAME = new QName("http://schemas.xmlsoap.org/soap/envelope/", "Envelope");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.xmlsoap.schemas.soap.envelope
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SoapEnvelope }
     * 
     */
    public SoapEnvelope createSoapEnvelope() {
        return new SoapEnvelope();
    }

    /**
     * Create an instance of {@link SoapBody }
     * 
     */
    public SoapBody createSoapBody() {
        return new SoapBody();
    }

    /**
     * Create an instance of {@link SoapFault }
     * 
     */
    public SoapFault createSoapFault() {
        return new SoapFault();
    }

    /**
     * Create an instance of {@link FaultDetail }
     * 
     */
    public FaultDetail createFaultDetail() {
        return new FaultDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoapEnvelope }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoapEnvelope }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.xmlsoap.org/soap/envelope/", name = "Envelope")
    public JAXBElement<SoapEnvelope> createEnvelope(SoapEnvelope value) {
        return new JAXBElement<SoapEnvelope>(_Envelope_QNAME, SoapEnvelope.class, null, value);
    }

}
