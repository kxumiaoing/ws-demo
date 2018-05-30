/**
 * UserServiceSoapBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.xumiao.ws.service;

public class UserServiceSoapBindingSkeleton implements UserService, org.apache.axis.wsdl.Skeleton {
    private UserService impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.ws.xumiao.com", "User"), com.xumiao.ws.vo.User.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getBlankUser", _params, new javax.xml.namespace.QName("", "getBlankUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://vo.ws.xumiao.com", "User"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://localhost:8080/wsddorg/services/UserService", "getBlankUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getBlankUser") == null) {
            _myOperations.put("getBlankUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getBlankUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"), java.lang.String.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUser", _params, new javax.xml.namespace.QName("", "getUserReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://vo.ws.xumiao.com", "User"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://localhost:8080/wsddorg/services/UserService", "getUser"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUser") == null) {
            _myOperations.put("getUser", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUser")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://vo.ws.xumiao.com", "User"), com.xumiao.ws.vo.User.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("getUserInfo", _params, new javax.xml.namespace.QName("", "getUserInfoReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://localhost:8080/wsddorg/services/UserService", "getUserInfo"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("getUserInfo") == null) {
            _myOperations.put("getUserInfo", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("getUserInfo")).add(_oper);
    }

    public UserServiceSoapBindingSkeleton() {
        this.impl = new UserServiceSoapBindingImpl();
    }

    public UserServiceSoapBindingSkeleton(UserService impl) {
        this.impl = impl;
    }
    public com.xumiao.ws.vo.User getBlankUser(com.xumiao.ws.vo.User in0) throws java.rmi.RemoteException
    {
        com.xumiao.ws.vo.User ret = impl.getBlankUser(in0);
        return ret;
    }

    public com.xumiao.ws.vo.User getUser(java.lang.String in0, int in1) throws java.rmi.RemoteException
    {
        com.xumiao.ws.vo.User ret = impl.getUser(in0, in1);
        return ret;
    }

    public java.lang.String getUserInfo(com.xumiao.ws.vo.User in0) throws java.rmi.RemoteException
    {
        java.lang.String ret = impl.getUserInfo(in0);
        return ret;
    }

}
