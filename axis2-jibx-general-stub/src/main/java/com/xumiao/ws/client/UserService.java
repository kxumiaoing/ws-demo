/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package com.xumiao.ws.client;


/*
 *  UserService java interface
 */
public interface UserService {
    /**
     * Auto generated method signature
     *
     * @param getBlankUser
     */
    public com.xumiao.ws.vo.GetBlankUserResponse getBlankUser(
        com.xumiao.ws.vo.GetBlankUser getBlankUser)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUserInfo
     */
    public com.xumiao.ws.vo.GetUserInfoResponse getUserInfo(
        com.xumiao.ws.vo.GetUserInfo getUserInfo)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUser
     */
    public com.xumiao.ws.vo.GetUserResponse getUser(
        com.xumiao.ws.vo.GetUser getUser) throws java.rmi.RemoteException;

    //
}
