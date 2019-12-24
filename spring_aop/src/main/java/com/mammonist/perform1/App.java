package com.mammonist.perform1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/perform1.xml");
        Perform perform = applicationContext.getBean(Perform.class);
        perform.perform();
        log.info("=======================================================================================================================================================================================================================================================================================================================================================================================================================================================");
        int i = perform.sing(1, 2);
        log.info(i + "");
    }
}
