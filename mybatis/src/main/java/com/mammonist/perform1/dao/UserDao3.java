package com.mammonist.perform1.dao;

import com.mammonist.perform1.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao3 {

    @Insert("insert into users (name,age) values(#{name},#{age})")
    void insert(User user);

    @Select("select * from users")
    List<User> getAll();

    @Delete("delete from users where id = #{id}")
    void delete(int id);




}
