package com.company;

/**
 * Created by 027937 on 3/12/2019.
 */
class Cat extends Animal {
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    @Override
    public void speak() {
        System.out.println("Meow.");
    }
}
