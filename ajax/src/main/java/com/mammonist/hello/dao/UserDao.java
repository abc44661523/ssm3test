package com.mammonist.hello.dao;

import com.mammonist.hello.entity.User;

import java.util.List;

public interface UserDao {
    User getUserByName(String name);

    List<User> getUsers();

    User login(String name,String pwd);
}
