package com.mammonist.perform1.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.sql.SQLException;

@Controller
public class UserServlet {
    @Autowired
    private UserService userService;

    public void save(User user) throws SQLException {
        System.out.println("in UserServlet");
        userService.save(user);
    }
}
