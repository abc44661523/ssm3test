package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Dept;

import java.util.List;

public interface DeptDao {

    Dept getDeptById(int id);

    List<Dept> getAll();

    void save(Dept dept);

    List<Dept> getAll2();
}
