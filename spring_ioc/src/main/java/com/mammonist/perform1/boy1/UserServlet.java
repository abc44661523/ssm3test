package com.mammonist.perform1.boy1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserServlet {
    private UserService userService;

    public void save(User user){
        System.out.println("in UserServlet");
        userService.save(user);
    }
}
