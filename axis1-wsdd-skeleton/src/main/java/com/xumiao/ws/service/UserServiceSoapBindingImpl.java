/**
 * UserServiceSoapBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xumiao.ws.service;

import com.xumiao.ws.vo.User;

public class UserServiceSoapBindingImpl implements UserService {
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User in0) throws java.rmi.RemoteException {
        return in0;
    }

    public com.xumiao.ws.vo.User getUser(java.lang.String in0, int in1) throws java.rmi.RemoteException {
        return new User(in1,in0);
    }

    public java.lang.String getUserInfo(com.xumiao.ws.vo.User in0) throws java.rmi.RemoteException {
        return in0.toString();
    }

}
