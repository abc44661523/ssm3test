package com.mammonist.perform1.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Emp {
    private Integer id;
    private String name;
    private Integer salary;
    private Dept dept;

    public Emp(String name, Integer salary, Dept dept) {
        this.name = name;
        this.salary = salary;
        this.dept = dept;
    }
}
