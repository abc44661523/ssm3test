package com.mammonist.perform1.coll;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Slf4j
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/coll.xml");
        CollectionBeanDemo cbd = applicationContext.getBean(CollectionBeanDemo.class);
        List<String> course = cbd.getCourse();
        log.info(course.toString());

        Map<String, String> maps = cbd.getMaps();
        maps.forEach((key,value)->{
            System.out.println(key + "-" + value);
        });

        Properties ps = cbd.getPs();
        ps.forEach((key,value)->{
            System.out.println(key + "-" + value);
        });
    }
}
