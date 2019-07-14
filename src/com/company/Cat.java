package com.company;

public class Cat extends RunningAnimal {

    public Cat(int age , int weight,String color,boolean mustage ) {
        setAge(age);
        setWeight(weight);
        setColor(color);
        setMustage(mustage);
    }

    @Override
    public String getName() {
        return "Cat";
    }
    @Override
    public String go() {
        return  " jump";
    }

    @Override
    protected String isRunning() {
        return "i am running";
    }
}
