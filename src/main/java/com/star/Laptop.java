package com.star;

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
