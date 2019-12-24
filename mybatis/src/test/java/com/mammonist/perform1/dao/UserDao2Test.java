package com.mammonist.perform1.dao;

import com.github.pagehelper.Page;
import com.mammonist.perform1.entity.User;
import com.mammonist.perform1.service.UserService;
import com.mammonist.perform1.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@Slf4j
public class UserDao2Test {

    SqlSession sqlSession = null;
    UserDao2 userDao2 = null;

    @Before
    public void init() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        //获得UserDao的实现类对象
        userDao2 = sqlSession.getMapper(UserDao2.class);
    }

    @Test
    public void getAllTest() {
        List<User> users = userDao2.getAll();
        log.info(users.toString());
    }

    @Test
    public void updateTest(){
        userDao2.update(new User(1,"xyj",23));
    }

    @Test
    public void insertTest(){
        userDao2.insert(new User("gc",18));
    }

    @Test
    public void deleteTest(){
        User user = new User();
        user.setId(1);
        userDao2.delete(user.getId());
    }

    @Test
    public void getUserByIdTest(){
        User user = new User();
        user.setId(3);
        user = userDao2.getUserById(user.getId());
        log.info(user.toString());
    }

    @Test
    public void getUsersByAge(){
        List<User> userByAge = userDao2.getUserByAge(18, 30);
        log.info(userByAge.toString());
    }

    @Test
    public void getUserByID(){
        Map<String, Object> user = userDao2.getUserByID(3);
        log.info(user.toString());
    }

    @Test
    public void getUserByUser(){
        User user = new User();
        user.setName("%z%");
//        user.setAge(21);
        List<User> users = userDao2.getUsersByUser(user);
        log.info(users.toString());
    }

    @Test
    public void update2(){
        User user = new User();
        user.setId(4);
        user.setName("ljz");
        user.setAge(40);
        userDao2.update2(user);
    }

    @Test
    public void getAll() throws IOException {
        UserService userService = new UserService();
        Page<User> pagedUsers = userService.getPagedUsers(3, 2);
        log.info(pagedUsers.toString());
    }

    @After
    public void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
