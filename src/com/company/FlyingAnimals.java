package com.company;

public abstract class FlyingAnimals extends Animal {

   private int wingSize;

    public int getWingSize() {
        return wingSize;
    }

    public void setWingSize(int wingSize) {
        this.wingSize = wingSize;
    }

    protected abstract String isFlying();

    @Override
    protected String go() {
        return " flying";
    }

    @Override
    public String toString() {
        return super.toString()+ " wing size: "+getWingSize() +isFlying();
    }
}
