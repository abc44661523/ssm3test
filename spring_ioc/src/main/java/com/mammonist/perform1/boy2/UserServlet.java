package com.mammonist.perform1.boy2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Data
@NoArgsConstructor
@Controller
public class UserServlet {
    @Autowired
    private UserService userService;

    public void save(User user){
        System.out.println("in UserServlet");
        userService.save(user);
    }
}
