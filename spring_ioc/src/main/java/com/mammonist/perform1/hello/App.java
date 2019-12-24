package com.mammonist.perform1.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class App {
    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();

        //Spring方法
        //获得容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/hello.xml");
        //从容器中获得对象
        log.info("=====================================================");
        HelloWorld helloWorld1 = (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld bean = applicationContext.getBean(HelloWorld.class);
        //调用方法
        helloWorld1.sayHello();
        bean.sayHello();

        BeanDemo beanDemo = applicationContext.getBean(BeanDemo.class);
        log.info(beanDemo.hello("dog"));

    }
}
