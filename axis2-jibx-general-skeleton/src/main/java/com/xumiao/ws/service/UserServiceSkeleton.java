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
     * @param getBlankUser
     * @return getBlankUserResponse
     */
    public com.xumiao.ws.vo.GetBlankUserResponse getBlankUser(
        com.xumiao.ws.vo.GetBlankUser getBlankUser) {
        GetBlankUserResponse response = new GetBlankUserResponse();

        response.setReturn(getBlankUser.getArgs0());

        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param getUserInfo
     * @return getUserInfoResponse
     */
    public com.xumiao.ws.vo.GetUserInfoResponse getUserInfo(
        com.xumiao.ws.vo.GetUserInfo getUserInfo) {
        User user = getUserInfo.getArgs0();
        String info = "姓名：" + user.getName() + "，年龄：" + user.getAge();
        GetUserInfoResponse response = new GetUserInfoResponse();

        response.setReturn(info);

        return response;
    }

    /**
     * Auto generated method signature
     *
     * @param getUser
     * @return getUserResponse
     */
    public com.xumiao.ws.vo.GetUserResponse getUser(
        com.xumiao.ws.vo.GetUser getUser) {
        User user = new User();

        user.setName(getUser.getArgs0());
        user.setAge(getUser.getArgs1());

        GetUserResponse response = new GetUserResponse();

        response.setReturn(user);

        return response;
    }
}
