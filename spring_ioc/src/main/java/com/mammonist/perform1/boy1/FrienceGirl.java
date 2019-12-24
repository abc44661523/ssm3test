package com.mammonist.perform1.boy1;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FrienceGirl implements Girl {
    private String name;
    private int age;

    public FrienceGirl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void kiss() {
        System.out.println(name + "is kissing ");
    }
}
