package com.star;
import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private  String name;

    private  Computer com;

//    @ConstructorProperties({"age", "name", "lap"})
//    public Alien(int age, String name, Computer com) {
//        this.age = age;
//        this.name = name;
//        this.com = com;
//    }

    public void code() {
        com.boot();
        System.out.println("Coding...");
        com.compile();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }


}
