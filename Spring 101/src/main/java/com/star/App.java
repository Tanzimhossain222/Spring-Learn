package com.star;

import com.star.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Desktop dt = context.getBean( Desktop.class);

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());


    }
}