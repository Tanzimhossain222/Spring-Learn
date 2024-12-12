package com.star;

public class Alien {

    private int age;
    private  String name;

    public Alien() {
        System.out.println("Alien object created!");
    }

    public void greeting() {
        System.out.println("Hello World!");
    }

    public void code() {
        System.out.println("Coding...");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting age...");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name...");
        this.name = name;
    }
}
