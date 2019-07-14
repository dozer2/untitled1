package com.company;

public class Snake extends RunningAnimal {
    public Snake(int age , int weight, String color,boolean mustage) {
        setAge(age);
        setWeight(weight);
        setColor(color);
        setMustage(mustage);
    }

    @Override
    public String go() {
        return " scream";
    }

    @Override
    public String getName() {
        return "Snake";
    }

    @Override
    protected String isRunning() {
        return "is hissing";
    }
}
