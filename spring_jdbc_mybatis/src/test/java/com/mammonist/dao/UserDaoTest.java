package com.mammonist.dao;

import com.mammonist.domain.User;
import com.mammonist.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;

public class UserDaoTest {
    @Test
    public void save() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        userDao.save(new User("mammonist",2000));
        sqlSession.commit();
        sqlSession.close();
    }
}