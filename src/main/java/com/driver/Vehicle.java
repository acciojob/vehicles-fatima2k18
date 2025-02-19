package com.driver;

public class Vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;


    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
    public void move(int speed, int direction) {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        System.out.println(name + " is moving at speed " + speed + " in direction " + direction + " degrees.");
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        this.currentSpeed = newSpeed;
        this.currentDirection = newDirection;
        System.out.println("Speed changed to " + newSpeed + " and direction to " + newDirection);
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Vehicle stopped.");
    }
}

