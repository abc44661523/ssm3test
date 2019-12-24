package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Student;
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
public class StudentDaoTest {
    SqlSession sqlSession = null;
    StudentDao studentDao;
    @Before
    public void init() throws IOException {
        //使用mybatis的一般流程
        //获得SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        //获得SqlSession对象
        sqlSession = sqlSessionFactory.openSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
    }

    @Test
    public void getStudentById(){
        Student student = studentDao.getStudentById(2);
        log.info(student.toString());
    }

    @Test
    public void getAll(){
        List<Student> students = studentDao.getAll();
        log.info(students.toString());
    }

    @Test
    public void deleteAll(){
        studentDao.deleteAll(new String[]{"1","2","3"});
    }

    @After
    public void destory(){
        //提交事务 ACID
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}
