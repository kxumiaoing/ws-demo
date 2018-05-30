package com.xumiao.ws.client;

import com.xumiao.ws.vo.*;

public class Axis2JibxClient {
    public static void main(String[] args) throws Exception {
        UserService service = new UserServiceStub();
        GetUserInfo getUserInfo = new GetUserInfo();
        User user = new User();

        user.setName("张三");
        user.setAge(10);
        getUserInfo.setArgs0(user);

        GetUserInfoResponse getUserInfoResponse = service.getUserInfo(getUserInfo);

        System.out.println("getUserInfo ---> " + getUserInfoResponse.getReturn());

        GetUser getUser = new GetUser();

        getUser.setArgs0("李四");
        getUser.setArgs1(11);

        GetUserResponse getUserResponse = service.getUser(getUser);

        System.out.println("getUser ---> " + getUserResponse.getReturn());

        GetBlankUser getBlankUser = new GetBlankUser();

        user.setName("王五");
        user.setAge(12);
        getBlankUser.setArgs0(user);

        GetBlankUserResponse getBlankUserResponse = service.getBlankUser(getBlankUser);

        System.out.println("getBlankUser ---> " + getBlankUserResponse.getReturn());
    }
}
