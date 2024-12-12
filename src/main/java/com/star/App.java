package com.star;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

//        obj.greeting();
//        obj.code();

//        Laptop laptop = (Laptop) context.getBean("laptop");
//        laptop.boot();
//        laptop.shutdown();
    }
}
