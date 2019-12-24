package com.mammonist.perform1.boy2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@NoArgsConstructor
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void save(User user){
        System.out.println("in UserService ");
        userDao.save(user);
    }
}
