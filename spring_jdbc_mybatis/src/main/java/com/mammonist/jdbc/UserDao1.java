package com.mammonist.jdbc;

import com.mammonist.domain.User;
import lombok.Data;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Data
public class UserDao1 {

    private JdbcTemplate jdbcTemplate;

    public void save(User user){
        String sql = "insert into users (name,age) values (?,?)";
        jdbcTemplate.update(sql,user.getName(),user.getAge());
    }

    public void update(User user){
        String sql = "update users set name = ?,age = ? where id = ?";
        jdbcTemplate.update(sql,user.getName(),user.getAge(),user.getId());
    }

    public void delete(int id){
        String sql = "delete from users where id = ?";
        jdbcTemplate.update(sql,id);
    }

    RowMapper<User> rowMapper = ((rs, rowNum) -> {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        return user;
    });

    public List<User> getUsersByAge(int age){
        String sql = "select * from users where age > ?";
        return jdbcTemplate.query(sql,rowMapper,age);
    }

    public User getUserById(int id){
        String sql = "select * from users where id = ?";
        return jdbcTemplate.queryForObject(sql,new UserRowMapper(),id);
    }

    public List<User> getAll(){
        String sql = "select * from users";
        return jdbcTemplate.query(sql,rowMapper);
    }
}

class UserRowMapper implements RowMapper<User>{
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setName(rs.getString("name"));
        user.setAge(rs.getInt("age"));
        return user;
    }
}
