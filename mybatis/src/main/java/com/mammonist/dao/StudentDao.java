package com.mammonist.dao;

import com.mammonist.entity.Student;

import java.util.List;

public interface StudentDao {
    Student getStudentById(int id);

    List<Student> getAll();

    void deleteAll(String[] ids);
}
