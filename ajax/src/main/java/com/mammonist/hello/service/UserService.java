package com.mammonist.hello.service;

import com.mammonist.hello.dao.UserDao;
import com.mammonist.hello.dao.UserDaoImp;
import com.mammonist.hello.entity.User;

import java.util.Iterator;
import java.util.List;

public class UserService {
    UserDao userDao = new UserDaoImp();

    public boolean isUniqueName(String name){
        return userDao.getUserByName(name) == null;
    }

    public User canLogin(String name, String pwd){
        User user = userDao.login(name, pwd);
        return user;
    }

    public List<User> getUsers(){
        return userDao.getUsers();
    }
}
