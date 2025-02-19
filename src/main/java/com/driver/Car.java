package com.driver;
public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;

    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1; // Default gear
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("Gear changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        super.move(newSpeed, newDirection); // Update speed and direction in Vehicle
    }

    public void stop() {
        super.stop(); // Ensure `stop()` is available

}


}

