package com.mammonist.perform1.conf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
