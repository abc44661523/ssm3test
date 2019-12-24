package com.mammonist.perform1.boy2;

import com.mammonist.perform1.boy1.Girl;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@Component
public class FrienceGirl implements Girl {
    @Autowired @Value("法国女人")
    private String name;
    @Autowired @Value("20")
    private int age;

    public FrienceGirl(String name,int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void kiss() {
        System.out.println(name + " is kissing ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
