package com.xumiao.ws.service.impl;

import com.xumiao.ws.service.UserService;
import com.xumiao.ws.vo.User;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(endpointInterface = "com.xumiao.ws.service.UserService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserServiceImpl implements UserService {
    @Override
    public User getBlankUser(User user) {
        return user;
    }

    @Override
    public String getUserInfo(User user) {
        return "姓名：" + user.getName() + "，年龄：" + user.getAge();
    }

    @Override
    public User getUser(String name, int age) {
        User user = new User();

        user.setName(name);
        user.setAge(age);

        return user;
    }
}
