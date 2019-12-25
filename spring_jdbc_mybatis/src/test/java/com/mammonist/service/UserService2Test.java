package com.mammonist.service;

import com.mammonist.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationContext2.xml")
public class UserService2Test {
    @Autowired
    UserService2 userService2;

    @Test
    public void save() {
        userService2.save(new User("ewqq",12));
    }
}