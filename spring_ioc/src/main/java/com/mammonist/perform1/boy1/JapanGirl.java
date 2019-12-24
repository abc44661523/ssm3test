package com.mammonist.perform1.boy1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JapanGirl implements Girl {
    private String name;
    private int age;

    public JapanGirl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void kiss() {
        System.out.println(name + " is kissing ");
    }
}
