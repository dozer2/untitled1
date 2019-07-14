package com.company.car;

public abstract class MovesObject {
    private int whellCount;
    private String gearBox;
    private int countPassenger;

    public MovesObject(int whellCount, String gearBox, int countPassenger) {
        this.whellCount = whellCount;
        this.gearBox = gearBox;
        this.countPassenger = countPassenger;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }

    public int getWhellCount() {
        return whellCount;
    }

    public void setWhellCount(int whellCount) {
        this.whellCount = whellCount;
    }

    public abstract void move();

    public abstract String getName();

    @Override
    public String toString() {
        return getName()+"{" +
                "whellCount=" + whellCount +
                ", gearBox='" + gearBox + '\'' +
                ", countPassenger=" + countPassenger +
                '}';
    }

    public void show(){
        System.out.println(this.toString());
    }
}

