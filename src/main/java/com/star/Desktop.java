package com.star;

public class Desktop implements Computer {

   public Desktop() {
        System.out.println("Desktop Constructor");
    }

    @Override
    public void boot() {
        System.out.println("Desktop Booting...");
    }

    @Override
    public void compile() {
        System.out.println("Desktop Compiling Code...");
    }

}
