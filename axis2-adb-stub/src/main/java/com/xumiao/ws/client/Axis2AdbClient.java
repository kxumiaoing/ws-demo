package com.xumiao.ws.client;

public class Axis2AdbClient {
    public static void main(String[] args) throws Exception {
        UserServiceStub serviceStub = new UserServiceStub();

        UserServiceStub.User user = new UserServiceStub.User();

        user.setName("张三");
        user.setAge(10);

        UserServiceStub.GetUserInfo getUserInfo = new UserServiceStub.GetUserInfo();

        getUserInfo.setArgs0(user);

        UserServiceStub.GetUserInfoResponse getUserInfoResponse = serviceStub.getUserInfo(getUserInfo);

        System.out.println("getUserInfo ---> " + getUserInfoResponse.get_return());

        UserServiceStub.GetUser getUser = new UserServiceStub.GetUser();

        getUser.setArgs0("李四");
        getUser.setArgs1(11);

        UserServiceStub.GetUserResponse getUserResponse = serviceStub.getUser(getUser);

        System.out.println("getUser ---> " + getUserResponse.get_return());

        user.setName("王五");
        user.setAge(12);

        UserServiceStub.GetBlankUser getBlankUser = new UserServiceStub.GetBlankUser();

        getBlankUser.setArgs0(user);

        UserServiceStub.GetBlankUserResponse getBlankUserResponse = serviceStub.getBlankUser(getBlankUser);

        System.out.println("getBlankUser ---> " + getBlankUserResponse.get_return());
    }
}
