package com.mammonist.dao;

import com.mammonist.domain.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    void update(User user);

    void delete(int id);

    User getUserById(int id);

    List<User> getAll();
}
