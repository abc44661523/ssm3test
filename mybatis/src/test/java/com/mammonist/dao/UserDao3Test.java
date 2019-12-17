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
public class UserDao3Test {
    SqlSession sqlSession;
    UserDao3 userDao3;

    @Before
    public void init() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        userDao3 = sqlSession.getMapper(UserDao3.class);
    }

    @Test
    public void insert(){
        User lzd = new User("lzd", 20);
        userDao3.insert(new User("lzd", 20));
    }

    @Test
    public void getAllTest(){
        List<User> users = userDao3.getAll();
        log.info(users.toString());
    }

    @Test
    public void delete(){
        userDao3.delete(3);
    }

    @After
    public void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
