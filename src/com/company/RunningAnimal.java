package com.company;

public abstract class RunningAnimal extends Animal {

    private Boolean mustage ;

    public Boolean getMustage() {
        return mustage;
    }

    public void setMustage(Boolean mustage) {
        this.mustage = mustage;
    }

    protected abstract String isRunning();

    @Override
    public String toString() {
        return super.toString()+ " mustage: "+getMustage()+ "  "+isRunning();
    }
}
