/*
 * fileUploadResources (https://github.com/hazendaz/fileUploadResources)
 *
 * Copyright 2013-2023 Hazendaz.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of The Apache Software License,
 * Version 2.0 which accompanies this distribution, and is available at
 * https://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * Contributors:
 *     Hazendaz (Jeremy Landis).
 */
package com.hazendaz.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.hazendaz.ws package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _GetHelloWorldResponse_QNAME = new QName("http://ws.hazendaz.com/",
                                                                    "getHelloWorldResponse");
    private static final QName _GetHelloWorld_QNAME         = new QName("http://ws.hazendaz.com/", "getHelloWorld");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.hazendaz.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHelloWorld }
     * 
     */
    public GetHelloWorld createGetHelloWorld() {
        return new GetHelloWorld();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHelloWorld } {@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hazendaz.com/", name = "getHelloWorld")
    public JAXBElement<GetHelloWorld> createGetHelloWorld(final GetHelloWorld value) {
        return new JAXBElement<GetHelloWorld>(ObjectFactory._GetHelloWorld_QNAME, GetHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link GetHelloWorldResponse }
     * 
     */
    public GetHelloWorldResponse createGetHelloWorldResponse() {
        return new GetHelloWorldResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <} {@link GetHelloWorldResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.hazendaz.com/", name = "getHelloWorldResponse")
    public JAXBElement<GetHelloWorldResponse> createGetHelloWorldResponse(final GetHelloWorldResponse value) {
        return new JAXBElement<GetHelloWorldResponse>(ObjectFactory._GetHelloWorldResponse_QNAME,
                GetHelloWorldResponse.class, null, value);
    }

}
