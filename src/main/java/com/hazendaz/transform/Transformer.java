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
package com.hazendaz.transform;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import com.hazendaz.ws.GetHelloWorld;

public class Transformer extends AbstractTransformer {

    public Transformer() {
        this.registerSourceType(GetHelloWorld.class);
        this.setReturnClass(String.class);
        this.setName("OrderToHTML");
    }

    @Override
    protected Object doTransform(final Object src, final String enc) throws TransformerException {
        final GetHelloWorld helloWorld = (GetHelloWorld) src;
        final String hello = helloWorld.getArg0();
        return hello;
    }

}
