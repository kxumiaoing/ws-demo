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
     * @param args0
     */
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User args0);

    /**
     * Auto generated method signature
     *
     * @param args0
     */
    public java.lang.String getUserInfo(com.xumiao.ws.vo.User args0);

    /**
     * Auto generated method signature
     *
     * @param args0
     * @param args1
     */
    public com.xumiao.ws.vo.User getUser(java.lang.String args0, int args1);
}
