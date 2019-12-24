package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.User;
import com.mammonist.perform1.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

@Slf4j
public class UserDao1Test {
    SqlSession sqlSession = null;

    @Before
    public void init() throws IOException {
        //使用mybatis的一般流程
        //获得SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        //获得SqlSession对象
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void insertTest() {
        //通过SqlSession对象执行Sql语句
        User user = new User("tom",18);
        sqlSession.insert("ljz.insertUser",user);
    }

    @Test
    public void getUserById(){
        User user = sqlSession.selectOne("ljz.getUserById",1);
        log.info(user.toString());
    }

    @Test
    public void updateById(){
        User user = new User(1,"zmm",1);
        sqlSession.update("ljz.updateById",user);
    }

    @Test
    public void deleteUser(){
        sqlSession.delete("ljz.deleteUser");
    }

    @Test
    public void getUsers(){
        List<Object> objects = sqlSession.selectList("ljz.getUsers");
        log.info(objects.toString());
    }

    @After
    public void destory(){
        //提交事务 ACID
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}
