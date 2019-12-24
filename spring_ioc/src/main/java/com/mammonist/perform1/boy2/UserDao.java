package com.mammonist.perform1.boy2;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@Repository
public class UserDao {
    @Autowired
//    private User user;

    public void save(User user){
        System.out.println("in UserDao");
    }
}
