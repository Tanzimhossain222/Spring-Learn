package com.star;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    @Override
    public void boot() {
        System.out.println("Laptop Booting...");
    }

    @Override
    public void  compile() {
        System.out.println("Laptop Compiling Code...");
    }

}
