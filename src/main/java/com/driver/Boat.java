package com.driver;

interface  waterVehicle{
    String getVehicleName();
    int getVehicleCapacity();
}
 public class Boat implements waterVehicle {
    String name;
    int capacity;
     public Boat(String name, int capacity) {
         this.name = name;
         this.capacity = capacity;
     }

     @Override
     public int getVehicleCapacity() {
         return 0;
     }
     @Override
     public String getVehicleName() {
         return name;
     }

}

