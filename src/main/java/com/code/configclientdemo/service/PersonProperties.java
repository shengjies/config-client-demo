package com.code.configclientdemo.service;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "person")
public class PersonProperties {
    private static  final int ID=0;
    private static final String NAME="hello";
    private static final int AGE = 18;

    private int id = ID;
    private String name = NAME;
    private int age = AGE;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
