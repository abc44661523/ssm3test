package com.mammonist.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    private int id;
    private String name;
    //爱好
    private String[] favor;

    public Person(String name, String[] favor) {
        this.name = name;
        this.favor = favor;
    }
}
