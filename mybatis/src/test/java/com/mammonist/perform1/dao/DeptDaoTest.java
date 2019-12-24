package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Dept;
import com.mammonist.perform1.entity.Emp;
import com.mammonist.perform1.util.MyBatisUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@Slf4j
public class DeptDaoTest {

    SqlSession sqlSession;
    DeptDao deptDao;

    @Before
    public void init() throws IOException {
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        sqlSession = sqlSessionFactory.openSession();
        deptDao = sqlSession.getMapper(DeptDao.class);
    }

    @Test
    public void getDeptById(){
        Dept dept = deptDao.getDeptById(1);
        log.info(dept.toString());
        List<Emp> emps = dept.getEmps();
        log.info(emps.toString());
    }

    @Test
    public void getAll(){
        List<Dept> depts = deptDao.getAll();
        log.info(depts.toString());
        Iterator<Dept> deptIterator = depts.iterator();
        while (deptIterator.hasNext()){
            Dept dept = deptIterator.next();
            log.info(dept.toString());
        }
    }

    @Test
    public void insert(){
        Dept dept = new Dept("admin");
        deptDao.save(dept);
    }

    @Test
    public void getAll2(){
        List<Dept> depts = deptDao.getAll2();
        log.info(depts.toString());
    }

    @After
    public void destory(){
        sqlSession.commit();
        sqlSession.close();
    }
}
