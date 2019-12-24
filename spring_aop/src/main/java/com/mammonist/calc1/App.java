package com.mammonist.calc1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/calc1.xml");
        Calc calc = applicationContext.getBean(Calc.class);
        calc.add(10, 14);
        calc.sub(2, 100);
    }
}
