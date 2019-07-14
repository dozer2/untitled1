package com.company.car;

public class Maz extends Cars {


    public Maz(int whellCount, String gearBox, int countPassenger, boolean cabriolet, String fuel) {
        super(whellCount, gearBox, countPassenger, cabriolet, fuel);
    }

    @Override
    public void move() {
        System.out.println( "MAZ move");

    }

    @Override
    public String getName() {
        return "maz ";
    }

    @Override
    void openDoor() {
        System.out.println( "open 1 dors");
    }


    public void openKuzoff()
    {
        System.out.println("maz has is opened kuzoff");
    }

    @Override
    public void show() {
        super.show();
        openKuzoff();
    }
}
