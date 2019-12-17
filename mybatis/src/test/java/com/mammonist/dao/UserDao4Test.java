package com.mammonist.dao;

import com.mammonist.entity.User;
import com.mammonist.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@Slf4j
public class UserDao4Test {
    SqlSession sqlSession;
    UserDao4 userDao4;

    @Before
    public void init() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        userDao4 = sqlSession.getMapper(UserDao4.class);
    }

    @Test
    public void getUserById(){
        User user = userDao4.getUserById(3);
        log.info(user.toString());
    }

    @Test
    public void delete(){
        userDao4.delete(6);
    }

    @Test
    public void getAll(){
        List<User> users = userDao4.getAll();
        log.info(users.toString());
    }

    @After
    public void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
