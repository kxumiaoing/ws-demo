package com.xumiao.ws.service.impl;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "com.xumiao.ws.service.UserService",serviceName = "UserService",targetNamespace = "http://localhost:8080/ws/services")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserServiceImpl implements UserService {
    @Override
    public String getUserInfo(User user) {
        return user.toString();
    }

    @Override
    public User getUser(String name, Integer age) {
        return new User(name,age);
    }

    @Override
    public User getBlankUser(User user) {
        return user;
    }
}
