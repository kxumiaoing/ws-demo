package com.xumiao.ws.client;

public class JaxWsClient {
    public static void main(String[] args) throws Exception {
        UserService service = new UserService_Service().getUserServiceImplPort();
        User user = new User();

        user.setName("张三");
        user.setAge(10);

        System.out.println(service.getUserInfo(user));
        System.out.println(service.getUser("李四",11));
        System.out.println(service.getBlankUser(user));
    }
}
