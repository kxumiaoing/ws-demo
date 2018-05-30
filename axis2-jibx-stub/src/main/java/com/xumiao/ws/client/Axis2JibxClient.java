package com.xumiao.ws.client;

import com.xumiao.ws.vo.User;

public class Axis2JibxClient {
    public static void main(String[] args) throws Exception{
        UserService service = new UserServiceStub();
        User user = new User();

        user.setName("张三");
        user.setAge(10);

        String ret = service.getUserInfo(user);

        System.out.println("getUserInfo ---> " + ret);

        user = service.getUser("李四",11);

        System.out.println("getUser ---> " + user);

        user.setName("王五");
        user.setAge(12);
        user = service.getBlankUser(user);

        System.out.println("getBlankUser ---> " + user);
    }
}
