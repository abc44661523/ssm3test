package com.mammonist.dao;

import com.mammonist.entity.Dept;

import java.util.List;

public interface DeptDao {

    Dept getDeptById(int id);

    List<Dept> getAll();

    void save(Dept dept);

    List<Dept> getAll2();
}
