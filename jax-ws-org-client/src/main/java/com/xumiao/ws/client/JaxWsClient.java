package com.xumiao.ws.client;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class JaxWsClient {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://localhost:8080/jaxservlet/services/UserService?wsdl");
        QName serviceName = new QName("http://localhost:8080/ws/services","UserService");
        Service service = Service.create(url,serviceName);
        UserService port = service.getPort(UserService.class);
        User user = new User();

        user.setName("张三");
        user.setAge(10);

        System.out.println(port.getUserInfo(user));
        System.out.println(port.getUser("李四",11));
        System.out.println(port.getBlankUser(user));

    }
}
