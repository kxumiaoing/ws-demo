package com.xumiao.ws.service;

import com.xumiao.ws.vo.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(serviceName = "UserService",targetNamespace = "http://localhost:8080/jaxb/services")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {
    @WebMethod
    String getUserInfo(@WebParam(name = "user") User user);

    @WebMethod
    User getUser(@WebParam(name = "name")String name,@WebParam(name = "age")Integer age);

    @WebMethod
    User getBlankUser(@WebParam(name = "user")User user);
}
