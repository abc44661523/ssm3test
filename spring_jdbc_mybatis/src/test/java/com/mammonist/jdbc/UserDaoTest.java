package com.mammonist.jdbc;

import com.mammonist.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = ("/spring_jdbc.xml"))
public class UserDaoTest {
    @Autowired
    UserDao1 userDao;

    @Test
    public void save() {
        userDao.save(new User("xxx",12));
    }

    @Test
    public void update(){
        userDao.update(new User(8,"zzz",20));
    }

    @Test
    public void delete(){
        userDao.delete(8);
    }

    @Test
    public void getUsersByAge(){
        List<User> users = userDao.getUsersByAge(20);
        log.info(users.toString());
    }

    @Test
    public void getUserById(){
        User user = userDao.getUserById(1);
        log.info(user.toString());
    }

    @Test
    public void getAll(){
        List<User> users = userDao.getAll();
        log.info(users.toString());
    }
}