package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Student;

import java.util.List;

public interface StudentDao {
    Student getStudentById(int id);

    List<Student> getAll();

    void deleteAll(String[] ids);
}
