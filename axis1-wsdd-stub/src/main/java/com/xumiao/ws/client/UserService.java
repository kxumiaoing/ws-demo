/**
 * UserService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xumiao.ws.client;

public interface UserService extends javax.xml.rpc.Service {
    public java.lang.String getUserServiceAddress();

    public UserServiceImpl getUserService() throws javax.xml.rpc.ServiceException;

    public UserServiceImpl getUserService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
