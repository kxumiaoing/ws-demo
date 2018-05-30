/**
 * UserServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.service;

import com.xumiao.ws.vo.User;

/**
 *  UserServiceSkeleton java skeleton for the axisService
 */
public class UserServiceSkeleton implements UserServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param args0
     * @return getBlankUserResponse
     */
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User args0) {
        return args0;
    }

    /**
     * Auto generated method signature
     *
     * @param args0
     * @return getUserInfoResponse
     */
    public java.lang.String getUserInfo(com.xumiao.ws.vo.User args0) {
        String info = "姓名：" + args0.getName() + "，年龄：" + args0.getAge();

        return info;
    }

    /**
     * Auto generated method signature
     *
     * @param args0
     * @param args1
     * @return getUserResponse
     */
    public com.xumiao.ws.vo.User getUser(java.lang.String args0, int args1) {
        User user = new User();

        user.setName(args0);
        user.setAge(args1);

        return user;
    }
}
