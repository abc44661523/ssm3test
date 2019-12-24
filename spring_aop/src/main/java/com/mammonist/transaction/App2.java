package com.mammonist.transaction;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@Slf4j
public class App2 {
    public static void main(String[] args) {
        StudentServiceImpl studentService1 = new StudentServiceImpl();
        TransactionAspect aspect = new TransactionAspect();
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                aspect.startTransaction();
                Object result = method.invoke(studentService1, args);
                aspect.commit();
                return result;
            }
        };

        InvocationHandler handler1 = (proxy,method,args2)->{
            aspect.startTransaction();
            Object result = method.invoke(studentService1, args2);
            aspect.commit();
            return result;
        };


        //第一个参数是ClassLoader对象
        StudentService studentService = (StudentService)Proxy.newProxyInstance(App2.class.getClassLoader(),
                            new Class[]{StudentService.class},
                            handler);
        studentService.save();
    }
}
