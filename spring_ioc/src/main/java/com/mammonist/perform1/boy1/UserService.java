package com.mammonist.perform1.boy1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserService {
    private UserDao userDao;

    public void save(User user){
        System.out.println("in UserService ");
        userDao.save(user);
    }
}
