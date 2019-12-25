package com.mammonist.service;

import com.mammonist.dao.UserDao;
import com.mammonist.domain.User;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Data
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    @Transactional
    public void save(User user){
        userDao.save(user);
    }
}
