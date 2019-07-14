package com.company.car;

public abstract class Cars extends MovesObject{
    private boolean cabriolet;
    private String fuel;

    public Cars(int whellCount, String gearBox, int countPassenger) {
        super(whellCount, gearBox, countPassenger);
    }

    public Cars(int whellCount, String gearBox, int countPassenger, boolean cabriolet, String fuel) {
        super(whellCount, gearBox, countPassenger);
        this.cabriolet=cabriolet;
        this.fuel= fuel;
    }

    public boolean isCabriolet() {
        return cabriolet;
    }

    public void setCabriolet(boolean cabriolet) {
        this.cabriolet = cabriolet;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    abstract void openDoor();

    @Override
    public String toString() {
        return  super.toString()+ " {" +
                "cabriolet=" + cabriolet +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}
