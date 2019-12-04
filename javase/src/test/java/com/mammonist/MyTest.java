package com.mammonist;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyTest {

    @Test
    public void test(){
        System.out.println("Hello World");
    }

    @Test
    public void test2() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/bussiness";
        String user = "root";
        String pwd = "root";

        Connection conn = DriverManager.getConnection(url,user,pwd);
        System.out.println(conn);
    }
}
