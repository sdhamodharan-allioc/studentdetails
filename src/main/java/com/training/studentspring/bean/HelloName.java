package com.training.studentspring.bean;

public class HelloName {
 public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printHello() {
        System.out.println("Hello ! " + name);
    }
}
