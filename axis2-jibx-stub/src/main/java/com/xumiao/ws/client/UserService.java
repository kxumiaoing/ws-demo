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
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User args0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUserInfo
     */
    public java.lang.String getUserInfo(com.xumiao.ws.vo.User args0)
        throws java.rmi.RemoteException;

    /**
     * Auto generated method signature
     *
     * @param getUser
     */
    public com.xumiao.ws.vo.User getUser(java.lang.String args0, int args1)
        throws java.rmi.RemoteException;

    //
}
