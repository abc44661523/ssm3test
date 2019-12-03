package com.mammonist.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/TwoServlet")
public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        String parameter = request.getParameter("omit");
        String arr[][] = {
                {"苏州","南通","无锡","常州"},
                {"浦东","宝山","徐汇","长宁","静安"},
                {"泰安","济南","烟台","淄博"},
                {"太原","大同","阳泉","长治"},
        };
        int i = Integer.parseInt(parameter);
        String brr[] = arr[i];

        String result = "";
        for (String city : brr){
            result += city +";";
        }
        if (result.length()>1){
            result = result.substring(0,result.length()-1);
        }
        response.getWriter().print(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}