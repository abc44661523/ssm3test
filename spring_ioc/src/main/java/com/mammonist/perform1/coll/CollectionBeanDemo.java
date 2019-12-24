package com.mammonist.perform1.coll;

import lombok.Data;

import java.util.*;

@Data
public class CollectionBeanDemo {
    private List<String> course = new ArrayList<>();
    private Map<String,String> maps = new HashMap<>();
    private Properties ps;
}
