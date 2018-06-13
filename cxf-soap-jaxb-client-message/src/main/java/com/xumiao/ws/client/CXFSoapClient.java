package com.xumiao.ws.client;

import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service;
import java.net.URL;

public class CXFSoapClient {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/jaxb/services/UserService?wsdl");
        QName serviceName = new QName("http://localhost:8080/jaxb/services","UserSoapService");
        QName portName = new QName("http://localhost:8080/jaxb/services","UserServicePort");
        Service service = Service.create(wsdlURL,serviceName);
        Dispatch<SOAPMessage> dispatch = service.createDispatch(portName,SOAPMessage.class,Service.Mode.MESSAGE);

        SOAPMessage getUserInfoMessage = MessageFactory.newInstance().createMessage();
        SOAPEnvelope getUserInfoEnvelope =  getUserInfoMessage.getSOAPPart().getEnvelope();
        SOAPBody getUserInfoBody = getUserInfoEnvelope.getBody();
        QName getUserInfoName = new QName("http://localhost:8080/jaxb/services","getUserInfo","ser");
        SOAPBodyElement getUserInfoEle = getUserInfoBody.addBodyElement(getUserInfoName);
        SOAPElement userEle = getUserInfoEle.addChildElement("user");

        userEle.addChildElement("name").setValue("张三");
        userEle.addChildElement("age").setValue("10");

        getUserInfoMessage.writeTo(System.out);

        SOAPMessage getUserInfoResponse = dispatch.invoke(getUserInfoMessage);
        String result = getUserInfoResponse.getSOAPBody().getElementsByTagName("userInfo").item(0).getTextContent();

        System.out.println("");
        System.out.println("=========================getUserInfo ======================== ");
        System.out.println(result);


        SOAPMessage getUserMessage = MessageFactory.newInstance().createMessage();
        SOAPEnvelope getUserEnvelope =  getUserMessage.getSOAPPart().getEnvelope();
        SOAPBody getUserBody = getUserEnvelope.getBody();
        QName getUserName = new QName("http://localhost:8080/jaxb/services","getUser","ser");
        SOAPBodyElement getUserEle = getUserBody.addBodyElement(getUserName);

        getUserEle.addChildElement("name").setValue("张三");
        getUserEle.addChildElement("age").setValue("10");

        getUserMessage.writeTo(System.out);

        SOAPMessage getUserResponse = dispatch.invoke(getUserMessage);
        String name = getUserResponse.getSOAPBody().getElementsByTagName("name").item(0).getTextContent();
        String age = getUserResponse.getSOAPBody().getElementsByTagName("age").item(0).getTextContent();

        System.out.println("");
        System.out.println("=========================getUser ======================== ");
        System.out.println("User(" + name + "," + age + ")");

        SOAPMessage getBlankUserMessage = MessageFactory.newInstance().createMessage();
        SOAPEnvelope getBlankUserEnvelope =  getBlankUserMessage.getSOAPPart().getEnvelope();
        SOAPBody getBlankUserBody = getBlankUserEnvelope.getBody();
        QName getBlankUserName = new QName("http://localhost:8080/jaxb/services","getBlankUser","ser");
        SOAPBodyElement getBlankUserEle = getBlankUserBody.addBodyElement(getBlankUserName);

        userEle = getBlankUserEle.addChildElement("user");
        userEle.addChildElement("name").setValue("张三");
        userEle.addChildElement("age").setValue("10");

        getBlankUserMessage.writeTo(System.out);

        SOAPMessage getBlankUserResponse = dispatch.invoke(getBlankUserMessage);

        name = getBlankUserResponse.getSOAPBody().getElementsByTagName("name").item(0).getTextContent();
        age = getBlankUserResponse.getSOAPBody().getElementsByTagName("age").item(0).getTextContent();

        System.out.println("");
        System.out.println("=========================getBlankUser ======================== ");
        System.out.println("User(" + name + "," + age + ")");
    }
}
