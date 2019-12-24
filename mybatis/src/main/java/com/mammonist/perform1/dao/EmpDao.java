package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Emp;

import java.util.List;

public interface EmpDao {

    void save(Emp emp);

    Emp getEmpById(int id);

    List<Emp> getAll();

    void delete(int id);

    void update(Emp emp);

    List<Emp> getAll2();
}
