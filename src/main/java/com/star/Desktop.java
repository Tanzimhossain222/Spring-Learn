package com.star;

public class Desktop implements Computer {


    @Override
    public void boot() {
        System.out.println("Desktop Booting...");
    }

    @Override
    public void compile() {
        System.out.println("Desktop Compiling Code...");
    }

}
