package com.company;

public class Cat extends Animal {

    public Cat(int age , int weight,String color,boolean mustage ) {
        setAge(age);
        setWeight(weight);
        setColor(color);

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
    public String eat() {
        return "mouse";
    }


}
