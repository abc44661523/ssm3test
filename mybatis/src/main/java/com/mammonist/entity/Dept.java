package com.mammonist.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Dept {
    private Integer id;
    private String name;
    private List<Emp> emps;

    public Dept(String name) {
        this.name = name;
    }
}
