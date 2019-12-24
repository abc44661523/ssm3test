package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserDao2 {

    public void update(User user);

    public List<User> getAll();

    public void insert(User user);

    public void delete(int id);

    public User getUserById(int id);

    //多个参数
    public List<User> getUserByAge(
         @Param("min1") int min,
         @Param("max1") int max);

    Map<String,Object> getUserByID(int id);

    List<User> getUsersByUser(User user);

    void update2(User user);
}
