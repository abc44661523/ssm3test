package com.mammonist.perform1.conf;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

@Slf4j
public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppJavaConfig.class);
        HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
//        HelloWorld helloWorld1 = (HelloWorld)applicationContext.getBean("helloWorld");
        helloWorld.sayHello();
        log.info("======================");
        DataSource dataSource = applicationContext.getBean(DataSource.class);
        log.info(dataSource.getConnection().toString());

        UserServlet servlet = applicationContext.getBean(UserServlet.class);
        servlet.save(new User("yunge", "1000"));
        log.info(servlet.toString());
    }
}
