package com.xumiao.ws.client;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class CXFSoapClient {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/jaxb/services/UserService?wsdl");
        QName serviceName = new QName("http://localhost:8080/jaxb/services","UserSoapService");
        Service service = Service.create(wsdlURL,serviceName);
        UserService port = service.getPort(UserService.class);
        User user = new User("张三",10);

        System.out.println(port.getUserInfo(user));
        System.out.println(port.getUser("李四",11));
        System.out.println(port.getBlankUser(user));

    }
}
