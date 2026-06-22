package com.kumara;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");//This creates the container and
                                                                           //parameter passed is config file


        Dev obj=context.getBean("dev",Dev.class);
       obj.build();
//        obj.setAge(21);
//        System.out.println(obj.getAge());




    }
}
