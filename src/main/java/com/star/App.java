package com.star;

import com.star.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        obj.code();

        Desktop dt = context.getBean(Desktop.class);
        dt.boot();
        dt.compile();
//        System.out.println(obj.getAge());
//        System.out.println(obj.getName());


    }
}
