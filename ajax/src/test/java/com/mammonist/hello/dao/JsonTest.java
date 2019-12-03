package com.mammonist.hello.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mammonist.hello.entity.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class JsonTest {

    @Test
    public void testArray() throws JsonProcessingException {
        //java数组转字符串
        String[] arr = {"ASP","JSP","PHP"};
        ObjectMapper objectMapper = new ObjectMapper();
        String str = objectMapper.writeValueAsString(arr);
        System.out.println(str);
        //json字符串转转java数组
        String json = "[\"mysql\",\"oracle\",\"redis\"]";
        String[] arr2 = objectMapper.readValue(json,String[].class);
        System.out.println(arr2[1]);
    }
    //java对象和json对象的转换
    @Test
    public void objectToJsonTest() throws JsonProcessingException {
        User tom = new User(123, "123", "123");
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(tom);
        System.out.println(s);

        //json转java对象
        String json = "{\"id\":123,\"name\":\"123\",\"gender\":null,\"phone_num\":null,\"qq\":null,\"email\":null,\"birthplace\":null,\"username\":null,\"password\":\"123\"}";
        User user = objectMapper.readValue(json,User.class);
        System.out.println(user);
    }

    //list<User>和json的转换
    @Test
    public void ListToJsonTest() throws JsonProcessingException {
        List<User> users = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        users.add(new User(123, "123", "123"));
        users.add(new User(123, "rewq", "123"));
        users.add(new User(123, "ewq", "123"));
        users.add(new User(123, "12ewq3", "123"));
        users.add(new User(123, "12ewq3", "123"));
        String str = objectMapper.writeValueAsString(users);
        System.out.println(str);


    }
}
