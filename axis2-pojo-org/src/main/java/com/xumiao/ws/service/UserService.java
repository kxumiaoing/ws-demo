package com.xumiao.ws.service;

import com.xumiao.ws.vo.User;

public class UserService {
    public String getUserInfo(User user) {
        return user.toString();
    }

    public User getUser(String name,int age) {
        return new User(name,age);
    }

    public User getBlankUser(User user) {
        return user;
    }
}
