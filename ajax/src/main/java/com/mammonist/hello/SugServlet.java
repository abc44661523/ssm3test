package com.mammonist.hello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SugServlet")
public class SugServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");

        String[] arr = {
                "Anna","Brittany","Cinderella","Diana",
                "Eva","Fiona","Gunda","Hege","Inga","Johanna",
                "Kitty","Linda","Nina","Ophelia","Petunia","Amanda",
                "Raquel","Cindy","Doris","Eve","Evita","Sunniva",
                "Tove","Unni","Violet","Liza","Elizabeth","Ellen",
                "Wenche","Vicky"
        };

        String result = "";
        for (String name : arr) {
            if (name.toLowerCase().startsWith(username.toLowerCase())){
                result += name + ";";
            }
        }

        if (result.length() > 1){
            result = result.substring(0,result.length() - 1);
        }

        response.getWriter().write(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
