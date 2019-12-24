package com.mammonist.perform1.conf;

import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.SQLException;

@Repository
public class UserDao {

    @Autowired
    private DataSource dataSource;

    public void save(User user) throws SQLException {
        QueryRunner queryRunner = new QueryRunner(dataSource);
        String sql = "insert into users (name,age) values(?,?)";
        queryRunner.update(sql,user.getName(),user.getAge());
        System.out.println("in UserDao");
    }
}
