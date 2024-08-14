package com.lamphamit.weekone.beans;

public class HelloBean {
    private String name;

    public String getName() {
        return this.name;
    }
    public String setName(String name) {
        return this.name = name;
    }
    public void sayHello() {
        System.out.println("Hello " + this.name);
    }
}
