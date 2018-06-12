package com.xumiao.ws.client;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class CXFSoapClient {
    public static void main(String[] args) throws Exception {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();

        factoryBean.setServiceClass(UserService.class);
        factoryBean.setAddress("http://localhost:8080/jaxb/services/UserService");

        UserService service = (UserService) factoryBean.create();
        User user = new User();

        user.setName("张三");
        user.setAge(10);

        System.out.println(service.getUserInfo(user));
        System.out.println(service.getUser("李四",11));
        System.out.println(service.getBlankUser(user));
    }
}
