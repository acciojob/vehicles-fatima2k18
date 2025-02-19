package com.driver;


public class Boat implements WaterVehicle {
   private String name;
   private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public String getVehicleName() {
        return null;
    }
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }


}

