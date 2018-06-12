package com.xumiao.ws.client;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CXFSoapClient {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/jaxb/services/UserService?wsdl");
        QName serviceName = new QName("http://localhost:8080/jaxb/services","UserService");
//        QName portName = new QName("http://localhost:8080/jaxb/services","UserServicePort");
//        QName userName = new QName("http://localhost:8080/jaxb/services","UUser");
//        String endpointAddress = "http://localhost:8080/jaxb/services/UserService";
        Service service = Service.create(wsdlURL,serviceName);
//        Service service = Service.create(serviceName);

//        service.addPort(portName,SOAPBinding.SOAP11HTTP_BINDING,endpointAddress);

//        Dispatch<JAXBContext> dispatch = service.createDispatch(portName,JAXBContext.class, Service.Mode.PAYLOAD);

//        dispatch.invoke(JAXBContext.newInstance(String.class,Integer.class).);
//        service.createDispatch(portName,User.class,Service.Mode.PAYLOAD);
        UserService port = service.getPort(UserService.class);
        User user = new User("张三",10);
//
        System.out.println(port.getUserInfo(user));
        System.out.println(port.getUser("李四",11));
        System.out.println(port.getBlankUser(user));

    }
}
