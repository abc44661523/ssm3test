package com.mammonist.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    public String handler(){
        System.out.println("in handler");
        return "hello";
    }
}
