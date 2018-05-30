/**
 * UserServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.service;

import com.xumiao.ws.vo.GetBlankUserResponse;
import com.xumiao.ws.vo.GetUserInfoResponse;
import com.xumiao.ws.vo.GetUserResponse;
import com.xumiao.ws.vo.User;

/**
 *  UserServiceSkeleton java skeleton for the axisService
 */
public class UserServiceSkeleton implements UserServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getBlankUser0
     * @return getBlankUserResponse1
     */
    public com.xumiao.ws.vo.GetBlankUserResponse getBlankUser(
        com.xumiao.ws.vo.GetBlankUser getBlankUser0) {
        GetBlankUserResponse response = new GetBlankUserResponse();

        response.set_return(getBlankUser0.getArgs0());

        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param getUserInfo2
     * @return getUserInfoResponse3
     */
    public com.xumiao.ws.vo.GetUserInfoResponse getUserInfo(
        com.xumiao.ws.vo.GetUserInfo getUserInfo2) {
        User user = getUserInfo2.getArgs0();
        String info = "姓名：" + user.getName() + "，年龄：" + user.getAge();
        GetUserInfoResponse response = new GetUserInfoResponse();

        response.set_return(info);

        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param getUser4
     * @return getUserResponse5
     */
    public com.xumiao.ws.vo.GetUserResponse getUser(
        com.xumiao.ws.vo.GetUser getUser4) {
        User user = new User();

        user.setName(getUser4.getArgs0());
        user.setAge(getUser4.getArgs1());

        GetUserResponse response = new GetUserResponse();

        response.set_return(user);

        return response;
    }
}
