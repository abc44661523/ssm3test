package com.mammonist.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
public class LoginController {

    @RequestMapping("/login1")
    public String login1(HttpServletRequest request, HttpServletResponse response){
        String username = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        log.info("处理登录请求" + username + "-" + pwd);
        return "success";
    }

    //方法2，方法中的参数名与表单中的字段名一样
    @RequestMapping("/login2")
    public String login2(String username,@RequestParam("pwd") String password){
        log.info("处理登录请求" + username + "-" + password);
        return "success";
    }

    //方法3，方法的参数是实体类，实体类的属性名与表单中的字段名字一样
    @RequestMapping("/login3")
    public String login3(User user){

        log.info("处理登录请求" + user);
        return "success";
    }


}
