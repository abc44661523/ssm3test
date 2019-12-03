package com.mammonist.hello;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mammonist.hello.entity.User;
import com.mammonist.hello.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.响应数据是数组
        //responseArray(request,response);
        //2.响应数据是User对象
        //responseUserObject(request,response);
        //3.响应数据是List<User>对象
        responseListUserObject(request,response);
    }

    private void responseListUserObject(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        ArrayList<User> users = new ArrayList<>();
        UserService userService = new UserService();
        List<User> users = userService.getUsers();
        ObjectMapper objectMapper = new ObjectMapper();
        String str = "";
        try {
            str = objectMapper.writeValueAsString(users);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        response.getWriter().write(str);
    }

    private void responseUserObject(HttpServletRequest request, HttpServletResponse response) throws IOException {
        User user = new User(1,"lzd", "123");
        ObjectMapper objectMapper = new ObjectMapper();
        String str = null;
        try {
            str = objectMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        response.getWriter().print(str);
    }

    private void responseArray(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //响应数据是数组
        String[] arr = {"MySql","Oracle","SQLServlet","SQLite"};
        //转json字符串
        ObjectMapper objectMapper = new ObjectMapper();
        String str = null;
        try {
            str = objectMapper.writeValueAsString(arr);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        response.getWriter().write(str);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
