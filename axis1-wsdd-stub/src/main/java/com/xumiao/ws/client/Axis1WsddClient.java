package com.xumiao.ws.client;

import com.xumiao.ws.vo.User;

public class Axis1WsddClient {
    public static void main(String[] args) throws Exception{
        UserService service = new UserServiceLocator();
        UserServiceImpl port = service.getUserService();
        System.out.println(port.getUserInfo(new User(10,"张三")));
        System.out.println(port.getUser("李四",11));
        System.out.println(port.getBlankUser(new User(12,"王五")));
    }
}
