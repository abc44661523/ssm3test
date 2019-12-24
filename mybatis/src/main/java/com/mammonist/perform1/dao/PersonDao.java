package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.Person;

public interface PersonDao {

    void save(Person person);

    Person getPersonById(int id);
}
