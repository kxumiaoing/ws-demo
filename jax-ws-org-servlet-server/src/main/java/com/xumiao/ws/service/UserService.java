package com.xumiao.ws.service;

import com.xumiao.ws.vo.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface UserService {
    @WebMethod
    String getUserInfo(User user);
    @WebMethod
    User getUser(String name,Integer age);
    @WebMethod
    User getBlankUser(User user);
}
