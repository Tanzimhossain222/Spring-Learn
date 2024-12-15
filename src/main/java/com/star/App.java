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
        dt.boot();
        dt.compile();

        Desktop dt1 = context.getBean( Desktop.class);
        dt1.boot();
        dt1.compile();


    }
}
