package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Person;
import com.mammonist.perform1.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

@Slf4j
public class PersonDaoTest {

    SqlSession sqlSession;
    PersonDao personDao;

    @Before
    public void init() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        personDao = sqlSession.getMapper(PersonDao.class);
    }

    @Test
    public void save(){
        Person person = new Person("lzd",new String[]{"c","t","r","l"});
        personDao.save(person);
    }

    @Test
    public void getPersonById(){
        Person person = personDao.getPersonById(1);
        log.info(person.toString());
    }

    @After
    public void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
