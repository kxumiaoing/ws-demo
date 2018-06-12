package com.xumiao.ws.client;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CXFSoapClient {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring-context.xml"});
        UserService service = (UserService) context.getBean("client");

        User user = new User();

        user.setName("张三");
        user.setAge(10);

        System.out.println(service.getUserInfo(user));
        System.out.println(service.getUser("李四",11));
        System.out.println(service.getBlankUser(user));
    }
}
