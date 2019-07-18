package com.company;

public class Bird extends Animal {

    public Bird(int age , int weight, String color, int wingSize) {
        setAge(age);
        setWeight(weight);
        setColor(color);

    }

    @Override
    public String go() {
        return "fly";
    }

    @Override
    public String eat() {
        return "worm";
    }

    @Override
    public String getName() {
        return "Bird ";
    }


}
