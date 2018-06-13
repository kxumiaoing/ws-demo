package com.xumiao.ws.service;

import com.xumiao.ws.vo.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * name serviceName targetNamespace, wsdlLocation are allowed.
 * */
@WebService(name = "UserService",serviceName = "UserSoapService",targetNamespace = "http://localhost:8080/jaxb/services")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {
    @WebMethod
    @WebResult(name = "userInfo")
    String getUserInfo(@WebParam(name = "user") User user);

    @WebMethod
    @WebResult(name = "user")
    User getUser(@WebParam(name = "name") String name, @WebParam(name = "age") Integer age);

    @WebMethod
    @WebResult(name = "blankUser")
    User getBlankUser(@WebParam(name = "user") User user);
}
