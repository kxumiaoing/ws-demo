/**
 * UserServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xumiao.ws.client;

import com.xumiao.ws.vo.User;

public interface UserServiceImpl extends java.rmi.Remote {
    public User getBlankUser(User in0) throws java.rmi.RemoteException;
    public User getUser(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public java.lang.String getUserInfo(User in0) throws java.rmi.RemoteException;
}
