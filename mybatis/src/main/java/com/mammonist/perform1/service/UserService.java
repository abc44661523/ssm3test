package com.mammonist.perform1.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.mammonist.perform1.dao.UserDao2;
import com.mammonist.perform1.entity.User;
import com.mammonist.perform1.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.io.IOException;

public class UserService {
    UserDao2 userDao2;

    public Page<User> getPagedUsers(int pages, int size) throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();
        userDao2 = sqlSession.getMapper(UserDao2.class);

        Page<User> page = PageHelper.startPage(pages, size);
        userDao2.getAll();

        sqlSession.commit();
        sqlSession.close();
        return page;
    }
}
