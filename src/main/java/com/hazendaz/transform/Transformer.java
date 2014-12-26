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
