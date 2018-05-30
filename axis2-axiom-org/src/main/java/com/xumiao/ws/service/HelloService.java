package com.xumiao.ws.service;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;

public class HelloService {
    public OMElement sayHello(OMElement ele) {
        ele.build();
        ele.detach();

        String msg = ele.getFirstElement().getText();
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace namespace = factory.createOMNamespace("http://localhost:8080/axiomorg/services/HelloService","uns");
        OMElement response = factory.createOMElement("sayHelloResponse",namespace);
        OMElement result = factory.createOMElement("result",namespace);

        result.addChild(factory.createOMText(result,"hello, " + msg));
        response.addChild(result);

        return response;
    }
}
