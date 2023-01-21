package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int currentSpeed;
    int currentDirection;

    public Boat(String name, int currentSpeed, int currentDirection) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }
    public void move(int speed, int direction){
        currentSpeed += speed;
        currentDirection += direction;
    }
    public void steer(int direction){
        currentDirection += direction;
    }
    public void stop(){
        currentSpeed = 0;
    }

    @Override
    public String getVehicleName() {
        return null;
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
