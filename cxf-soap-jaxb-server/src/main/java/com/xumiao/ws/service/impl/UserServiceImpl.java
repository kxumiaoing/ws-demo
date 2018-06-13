package com.xumiao.ws.service.impl;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * portName(wsdl:port), endpointInterface are allowed.
 * */
@WebService(portName = "UserServicePort",endpointInterface = "com.xumiao.ws.service.UserService")
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
