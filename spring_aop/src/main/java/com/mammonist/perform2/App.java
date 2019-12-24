package com.mammonist.perform2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/perform2.xml");
        Perform perform = applicationContext.getBean(Perform.class);
        perform.perform();
    }
}
