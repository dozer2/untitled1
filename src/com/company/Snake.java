package com.company;

public class Snake extends Animal {
    public Snake(int age , int weight, String color,boolean mustage) {
        setAge(age);
        setWeight(weight);
        setColor(color);

    }

    @Override
    public String go() {
        return " scream";
    }

    @Override
    public String eat() {
        return "eggs";
    }

    @Override
    public String getName() {
        return "Snake";
    }


}
