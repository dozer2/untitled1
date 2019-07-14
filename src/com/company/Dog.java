package com.company;

public class Dog extends RunningAnimal {

    public Dog(int age , int weight, String color,boolean mustage) {
        setAge(age);
        setWeight(weight);
        setColor(color);
        setMustage(mustage);
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
    protected String isRunning() {
        return "im running";
    }
}
