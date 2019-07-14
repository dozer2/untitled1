package com.company.car;

public class Ferrari extends Cars {


    public Ferrari(int whellCount, String gearBox, int countPassenger, boolean cabriolet, String fuel) {
        super(whellCount, gearBox, countPassenger, cabriolet, fuel);
    }

    @Override
    public void move() {
        System.out.println( "ferrari move");

    }

    @Override
    public String getName() {
        return "Ferrari ";
    }

    @Override
    void openDoor() {
        System.out.println( "open 2 dors");
    }

    public void fast()
    {
        System.out.println("ferrari faster car ");
    }

    @Override
    public void show() {
        super.show();
        fast();
    }
}
