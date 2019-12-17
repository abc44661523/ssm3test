package com.mammonist.dao;

import com.mammonist.entity.Emp;

import java.util.List;

public interface EmpDao {

    void save(Emp emp);

    Emp getEmpById(int id);

    List<Emp> getAll();

    void delete(int id);

    void update(Emp emp);

    List<Emp> getAll2();
}
