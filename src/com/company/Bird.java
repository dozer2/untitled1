package com.company;

public class Bird extends FlyingAnimals {

    public Bird(int age , int weight, String color, int wingSize) {
        setAge(age);
        setWeight(weight);
        setColor(color);
        setWingSize(wingSize);
    }

    @Override
    public String getName() {
        return "Bird ";
    }

    @Override
    protected String isFlying() {
        return " i am flying faster";
    }
}
