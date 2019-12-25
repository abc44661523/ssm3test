package com.mammonist.dao;

import com.mammonist.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserDaoTest2 {
    @Autowired
    UserDao userDao;

    @Test
    public void saveTest(){
        userDao.save(new User("aaa",20000));
    }

}
