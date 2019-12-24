package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.User;
import com.mammonist.perform1.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class CacheDemoTest {
    //一级缓存
    @Test
    public void cache1Test() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("ljz.getUserById", 1);
        log.info(user + "===========");

        User user2 = sqlSession.selectOne("ljz.getUserById",1);
        log.info("============" + user2 + "============");

        sqlSession.commit();
        sqlSession.close();
    }

    //二级缓存
    @Test
    public void cache2Test() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.selectOne("ljz.getUserById");
        sqlSession.close();
        log.info("==============");

        SqlSession sqlSession1 = sqlSessionFactory.openSession();
        User user = sqlSession1.selectOne("ljz.getUserById", 1);

        sqlSession.commit();
        sqlSession.close();

    }
}
