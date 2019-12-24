package com.mammonist.transaction;

public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceProxy(new StudentServiceImpl());
        studentService.save();
    }
}
