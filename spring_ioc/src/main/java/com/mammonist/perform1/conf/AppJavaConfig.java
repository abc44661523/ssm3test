package com.mammonist.perform1.conf;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.mammonist.conf")
@PropertySource("classpath:db.properties")
public class AppJavaConfig {

    @Autowired
    Environment environment;

    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }

    @Bean
    public DataSource druidDateSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUsername(environment.getProperty("user"));
        druidDataSource.setPassword(environment.getProperty("password"));
        druidDataSource.setUrl(environment.getProperty("url"));
        druidDataSource.setDriverClassName(environment.getProperty("driver"));
        return druidDataSource;
    }

}
