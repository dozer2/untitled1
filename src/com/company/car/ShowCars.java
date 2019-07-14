package com.company.car;

public class ShowCars {
    public static void main (String[] args){
        Bike bike=new Bike(2,"manual",2);
        bike.show();
        Ferrari ferrari=new Ferrari(4,"auto",2,true,"benz");
        ferrari.show();
        Maz maz= new Maz(4,"manual",2,false,"dizel");
        maz.show();

    }
}
