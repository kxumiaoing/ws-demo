/**
 * UserService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xumiao.ws.client;

public interface UserService_PortType extends java.rmi.Remote {
    public com.xumiao.ws.client.User getBlankUser(com.xumiao.ws.client.User in0) throws java.rmi.RemoteException;
    public com.xumiao.ws.client.User getUser(java.lang.String in0, int in1) throws java.rmi.RemoteException;
    public java.lang.String getUserInfo(com.xumiao.ws.client.User in0) throws java.rmi.RemoteException;
}
