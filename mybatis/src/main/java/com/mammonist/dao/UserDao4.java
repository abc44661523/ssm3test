package com.mammonist.dao;

import com.mammonist.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserDao4 {
    @Delete("delete from users where id = #{id}")
    void delete(int id);

    User getUserById(int id);

    @Select("select * from users")
    List<User> getAll();
}
