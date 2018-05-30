/**
 * UserServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.service;

import com.xumiao.ws.vo.*;

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
    public com.xumiao.ws.vo.GetBlankUserResponseDocument getBlankUser(
        com.xumiao.ws.vo.GetBlankUserDocument getBlankUser0) {
        GetBlankUserResponseDocument document = GetBlankUserResponseDocument.Factory.newInstance();
        GetBlankUserResponseDocument.GetBlankUserResponse response = document.addNewGetBlankUserResponse();

        response.setReturn(getBlankUser0.getGetBlankUser().getArgs0());

        return document;
    }

    /**
     * Auto generated method signature
     *
     * @param getUser2
     * @return getUserResponse3
     */
    public com.xumiao.ws.vo.GetUserResponseDocument getUser(
        com.xumiao.ws.vo.GetUserDocument getUser2) {
        GetUserDocument.GetUser getUser = getUser2.getGetUser();
        User user = User.Factory.newInstance();

        user.setName(getUser.getArgs0());
        user.setAge(getUser.getArgs1());

        GetUserResponseDocument document = GetUserResponseDocument.Factory.newInstance();
        GetUserResponseDocument.GetUserResponse response = document.addNewGetUserResponse();

        response.setReturn(user);

        return document;
    }

    /**
     * Auto generated method signature
     *
     * @param getUserInfo4
     * @return getUserInfoResponse5
     */
    public com.xumiao.ws.vo.GetUserInfoResponseDocument getUserInfo(
        com.xumiao.ws.vo.GetUserInfoDocument getUserInfo4) {
        User user = getUserInfo4.getGetUserInfo().getArgs0();
        String msg = "姓名：" + user.getName() + "，年龄：" + user.getAge();
        GetUserInfoResponseDocument document = GetUserInfoResponseDocument.Factory.newInstance();
        GetUserInfoResponseDocument.GetUserInfoResponse response = document.addNewGetUserInfoResponse();

        response.setReturn(msg);

        return document;
    }
}
