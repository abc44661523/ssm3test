package com.mammonist.dao;

import com.mammonist.entity.Person;
import com.mammonist.entity.User;

public interface PersonDao {

    void save(Person person);

    Person getPersonById(int id);
}
