package com.mammonist.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@Controller
@RestController
@Slf4j
public class AjaxController {

    //返回JSON数组给客户端
    @RequestMapping("/ajax1")
    @ResponseBody
    public String[] ajax1(){
        return new String[]{"JSP","ASP","PHP","OK"};
    }

    @RequestMapping("/ajax2")
    @ResponseBody
    public User ajax2(User user){
        log.info(user.toString());
        return new User("lzd","213");
    }

    @RequestMapping("/ajax3")
    @ResponseBody
    public List<User> ajax3(){
        List<User> users = new ArrayList<>();
        users.add(new User("tyu","67"));
        users.add(new User("ewqdsu","67"));
        users.add(new User("fdstyu","67"));
        users.add(new User("tdsadyu","67"));
        users.add(new User("tydsau","67"));
        return users;
    }


}
