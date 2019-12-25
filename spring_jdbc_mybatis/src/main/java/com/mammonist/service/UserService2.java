package com.mammonist.service;

import com.mammonist.dao.UserDao;
import com.mammonist.domain.User;
import lombok.Data;

@Data
public class UserService2 {
    UserDao userDao;

    public void save(User user){
        userDao.save(user);
    }
}
