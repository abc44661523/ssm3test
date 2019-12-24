package com.mammonist.perform1.life;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
@ToString
public class BeanLifeDemo implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;
    private String beanName;

    public BeanLifeDemo() {
        log.info("1:调用无惨构造方法创建对象");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        log.info("2:调用set方法设置值");
        this.name = name;
    }

    @Override
    public void setBeanName(String name) {
        log.info("3:被调用BeanNameAware接口中的方法是，获得Bean的名字：" + name);
        this.beanName = name;
    }

    public void show(){
        log.info("name=" + this.name + ",beanName=" + this.beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("3:调用ApplicationContextAware接口中的方法，获得ApplicationContext对象：" + applicationContext);
    }

    //注解的初始化方法
    @PostConstruct
    public void init1(){
        log.info("5.1:注解的初始化方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("5.2:InitializingBean接口中的初始化方法");
    }

    //配置中init-method属性定义的初始化方法
    public void init3(){
        log.info("5.3:init-method属性定义的初始化方法");
    }

    @PreDestroy
    public void destroy0(){
        log.info("7.1:注解@PreDestory...");
    }


    @Override
    public void destroy() throws Exception {
        log.info("7.2:DisposableBean中的方法");
    }

    public void destroy2(){
        log.info("7.3:bean配置中的destroy方法");
    }
}
