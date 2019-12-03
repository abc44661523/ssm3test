package com.mammonist.hello.dao;

import com.mammonist.hello.entity.User;
import com.mammonist.hello.util.JDBCUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class UserDaoImp implements UserDao {
    QueryRunner queryRunner = new QueryRunner(JDBCUtil.getDataSource());

    @Override
    public User getUserByName(String name) {
        String sql = "select * from user where name = ?";
        User user = null;
        try {
            user = queryRunner.query(sql, new BeanHandler<User>(User.class), name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getUsers() {
        String sql = "select * from user";
        List<User> users = null;
        try {
            users = queryRunner.query(sql, new BeanListHandler<User>(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User login(String name, String pwd) {
        String sql = "select * from user where name = ? and password = ?";
        User user = null;
        try {
            user = queryRunner.query(sql, new BeanHandler<User>(User.class), name,pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
