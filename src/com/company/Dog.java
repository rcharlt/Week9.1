package com.company;

/**
 * Created by 027937 on 3/12/2019.
 */
class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void speak() {
        System.out.println("Bark");
    }
}
