package com.company;

public class SlowlyBird extends FlyingAnimals {

    public SlowlyBird(int age , int weight, String color,int wingSize) {
        setAge(age);
        setWeight(weight);
        setColor(color);
        setWingSize(wingSize);
    }

    @Override
    protected String isFlying() {
        return " i am flying slowly";
    }



    @Override
    protected String getName() {
        return "Slowly bird";
    }

}
