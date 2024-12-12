package com.star;

public class Alien {

    private int age;
    private  String name;

    private  Laptop lap;

    public Alien() {
        System.out.println("Alien object created!");
    }

    public void code() {
        System.out.println("Coding...");
        lap.boot();
        lap.compile();
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

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("Setting laptop...");
        this.lap = lap;
    }


}
