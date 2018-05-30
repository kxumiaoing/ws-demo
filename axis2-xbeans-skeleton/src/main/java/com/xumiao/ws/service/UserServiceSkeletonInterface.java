/**
 * UserServiceSkeletonInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.service;

/**
 *  UserServiceSkeletonInterface java skeleton interface for the axisService
 */
public interface UserServiceSkeletonInterface {
    /**
     * Auto generated method signature
     *
     * @param getBlankUser
     */
    public com.xumiao.ws.vo.GetBlankUserResponseDocument getBlankUser(
        com.xumiao.ws.vo.GetBlankUserDocument getBlankUser);

    /**
     * Auto generated method signature
     *
     * @param getUser
     */
    public com.xumiao.ws.vo.GetUserResponseDocument getUser(
        com.xumiao.ws.vo.GetUserDocument getUser);

    /**
     * Auto generated method signature
     *
     * @param getUserInfo
     */
    public com.xumiao.ws.vo.GetUserInfoResponseDocument getUserInfo(
        com.xumiao.ws.vo.GetUserInfoDocument getUserInfo);
}
