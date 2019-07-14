package com.company.car;

public class Bike extends MovesObject {


    public Bike(int whellCount, String gearBox, int countPassenger) {
        super(whellCount, gearBox, countPassenger);
    }


    @Override
    public void move() {
        System.out.println("Bike move");
    }

    @Override
    public String getName() {
        return "Bike";
    }
}
