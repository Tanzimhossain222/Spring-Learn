package com.star;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private  String name;

    private  Laptop lap;

    public Alien() {
        System.out.println("Alien object created!");
    }

    @ConstructorProperties({"age", "name", "lap"})
    public Alien(int age, String name, Laptop lap) {
        this.age = age;
        this.name = name;
        this.lap = lap;
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
