package com.mammonist.dao;

import com.mammonist.entity.Dept;
import com.mammonist.entity.Emp;
import com.mammonist.util.MyBatisUtil;
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
public class EmpDaoTest {
    SqlSession sqlSession = null;
    EmpDao empDao;

    @Before
    public void init() throws IOException {
        //使用mybatis的一般流程
        //获得SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = MyBatisUtil.getSqlSessionFactory();
        //获得SqlSession对象
        sqlSession = sqlSessionFactory.openSession();
        empDao = sqlSession.getMapper(EmpDao.class);
    }

    @Test
    public void save(){
        Dept dept = new Dept();
        dept.setId(1);
        Emp emp = new Emp("wang5",12000,dept);
        empDao.save(emp);
    }

    @Test
    public void getEmpById(){
        Emp emp = empDao.getEmpById(1);
        log.info(emp.toString());
        log.info(emp.getDept().toString());
    }

    @Test
    public void getAll(){
        List<Emp> emps = empDao.getAll();
        log.info(emps.toString());
        Iterator<Emp> empIterator = emps.iterator();
        while (empIterator.hasNext()){
            Emp emp = empIterator.next();
            log.info(emp.getDept().toString());
        }
    }

    @Test
    public void delete(){
        Emp emp = new Emp();
        emp.setId(3);
        empDao.delete(emp.getId());
    }

    @Test
    public void update(){
        Dept dept = new Dept();
        dept.setId(2);
        Emp emp = new Emp("zrq",5000,dept);
        emp.setId(2);
        empDao.update(emp);
    }

    @Test
    public void getAll2(){
        List<Emp> emps = empDao.getAll2();
        log.info(emps.toString());
    }

    @After
    public void destory(){
        //提交事务 ACID
        sqlSession.commit();
        //关闭资源
        sqlSession.close();
    }
}
