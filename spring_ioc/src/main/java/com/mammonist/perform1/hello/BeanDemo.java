package com.mammonist.perform1.hello;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BeanDemo {

    private BeanDemo(){
        log.info("无惨构造方法");
    }

    public String hello(String name){
        return "Hello" + name;
    }

    //工厂方法
    public static BeanDemo getInstance(){
        log.info("工厂模式");
        return new BeanDemo();
    }
}
