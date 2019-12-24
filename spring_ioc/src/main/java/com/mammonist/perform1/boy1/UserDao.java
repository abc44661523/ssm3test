package com.mammonist.perform1.boy1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDao {
    private User user;
    public void save(User user){
        System.out.println("in UserDao");
    }
}
