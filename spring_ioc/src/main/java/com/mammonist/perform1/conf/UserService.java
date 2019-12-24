package com.mammonist.perform1.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void save(User user) throws SQLException {
        System.out.println("in UserService ");
        userDao.save(user);
    }
}
