package com.mammonist.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class ListController {

    //方法1：返回ModelAndView
    @RequestMapping("/list1")
    public ModelAndView list1(){
        log.info("获得数据，保存数据，转页面");
        ModelAndView mv = new ModelAndView("list");
        //装要在页面中显示的数据
        mv.addObject("msg","消息");
        mv.addObject("uuu",new User("iuw","2345678"));
        String[] arr = {"dsa","das","asd"};
        mv.addObject("db",arr);

        List<User> users = new ArrayList<>();
        users.add(new User("tyu","67"));
        users.add(new User("ewqdsu","67"));
        users.add(new User("fdstyu","67"));
        users.add(new User("tdsadyu","67"));
        users.add(new User("tydsau","67"));
        mv.addObject("list",users);
        return mv;
    }

    @RequestMapping("/list")
    public void list(HttpServletResponse response) throws IOException {
        response.getWriter().write("cnm");
    }
}
