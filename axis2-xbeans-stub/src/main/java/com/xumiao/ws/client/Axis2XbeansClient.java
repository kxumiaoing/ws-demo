package com.xumiao.ws.client;

import com.xumiao.ws.vo.*;

public class Axis2XbeansClient {
    public static void main(String[] args) throws Exception{
//        UserServiceStub serviceStub = new UserServiceStub("http://localhost:8080/xbeansske/services/UserService");
//        UserServiceStub serviceStub = new UserServiceStub("http://localhost:8080/adbske/services/UserService");
        UserServiceStub serviceStub = new UserServiceStub("http://localhost:8080/jibxske/services/UserService");
        GetUserInfoDocument getUserInfoDocument = GetUserInfoDocument.Factory.newInstance();
        GetUserInfoDocument.GetUserInfo getUserInfo = getUserInfoDocument.addNewGetUserInfo();
        User user = User.Factory.newInstance();

        user.setName("张三");
        user.setAge(10);
        getUserInfo.setArgs0(user);

        GetUserInfoResponseDocument getUserInfoResponseDocument = serviceStub.getUserInfo(getUserInfoDocument);

        System.out.println("getUserInfo ---> " + getUserInfoResponseDocument.getGetUserInfoResponse().getReturn());

        GetUserDocument getUserDocument = GetUserDocument.Factory.newInstance();
        GetUserDocument.GetUser getUser = getUserDocument.addNewGetUser();

        getUser.setArgs0("李四");
        getUser.setArgs1(11);

        GetUserResponseDocument getUserResponseDocument = serviceStub.getUser(getUserDocument);

        System.out.println("getUser ---> " + getUserResponseDocument.getGetUserResponse().getReturn());

        user.setName("王五");
        user.setAge(12);

        GetBlankUserDocument getBlankUserDocument = GetBlankUserDocument.Factory.newInstance();
        GetBlankUserDocument.GetBlankUser getBlankUser = getBlankUserDocument.addNewGetBlankUser();

        getBlankUser.setArgs0(user);

        GetBlankUserResponseDocument getBlankUserResponseDocument = serviceStub.getBlankUser(getBlankUserDocument);

        System.out.println("getBlankUser ---> " + getBlankUserResponseDocument.getGetBlankUserResponse().getReturn());
    }
}
