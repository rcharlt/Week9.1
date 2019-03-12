package com.company;

/**
 * Created by 027937 on 3/12/2019.
 */
abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract public void speak();


}
