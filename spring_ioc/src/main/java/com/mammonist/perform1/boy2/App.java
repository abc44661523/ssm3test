package com.mammonist.perform1.boy2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/boy2.xml");
        JapanGirl girl = applicationContext.getBean(JapanGirl.class);
        log.info(girl.toString());
        log.info("===============================");
        FrienceGirl frienceGirl = applicationContext.getBean(FrienceGirl.class);
        log.info(frienceGirl.toString());
        frienceGirl.kiss();
        log.info("===============================");
        Boy boy = applicationContext.getBean(Boy.class);
        log.info(boy.toString());
        log.info(boy.getGirl().toString());
        log.info("===============================");
        UserServlet servlet = applicationContext.getBean(UserServlet.class);
        servlet.save(new User());
        log.info(servlet.toString());
    }
}
