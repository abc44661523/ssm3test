package com.mammonist.hello.dao;

import com.mammonist.hello.entity.User;
import org.junit.Test;

public class UserDaoImpTest {

    @Test
    public void getUserByName() {
        UserDao userDao = new UserDaoImp();
        String name = "lzd";
        User user = userDao.getUserByName(name);
        System.out.println(user);
    }
}