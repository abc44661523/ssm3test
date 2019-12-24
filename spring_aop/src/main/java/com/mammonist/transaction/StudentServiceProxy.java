package com.mammonist.transaction;

//静态代理类，
//1.实现与被代理类一样的接口
public class StudentServiceProxy implements StudentService {
    //2.包含被代理类对象
    private StudentService studentService;
    private TransactionAspect transactionAspect = new TransactionAspect();

    public StudentServiceProxy(StudentService studentService){
        this.studentService = studentService;
    }

    @Override
    public void save() {
        transactionAspect.startTransaction();
        studentService.save();
        transactionAspect.commit();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete(int id) {

    }
}
