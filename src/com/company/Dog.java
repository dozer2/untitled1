package com.company;

public class Dog extends Animal {

    public Dog(int age , int weight, String color,boolean mustage) {
        setAge(age);
        setWeight(weight);
        setColor(color);

    }

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public String go() {
        return " run";
    }

    @Override
    public String eat() {
        return "meat";
    }


}
