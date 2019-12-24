package com.mammonist.transaction;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Slf4j
public class MethodDemo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        String str = "java";
        char c = str.charAt(2);

        Class<String> clazz = String.class;
        Method method = clazz.getMethod("charAt",int.class);
        char o = (Character)method.invoke(str, 2);

        log.info(o + "");

    }


}
