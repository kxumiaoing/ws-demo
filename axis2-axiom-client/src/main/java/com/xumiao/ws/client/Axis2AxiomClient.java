package com.xumiao.ws.client;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.Constants;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;

public class Axis2AxiomClient {
    public static void main(String[] args) throws Exception {
        OMFactory factory = OMAbstractFactory.getOMFactory();
        OMNamespace namespace = factory.createOMNamespace("http://localhost:8080/axiomorg/services/HelloService","uns");
        OMElement request = factory.createOMElement("sayHelloRequest",namespace);
        OMElement msg = factory.createOMElement("msg",namespace);

        msg.addChild(factory.createOMText(msg,"张三"));
        request.addChild(msg);

        Options options = new Options();

        options.setTo(new EndpointReference("http://localhost:8080/axiomorg/services/HelloService"));
        options.setTransportInProtocol(Constants.TRANSPORT_HTTP);

        ServiceClient client = new ServiceClient();

        client.setOptions(options);

        String ret = client.sendReceive(request).getFirstElement().getText();

        System.out.println(ret);
    }
}
