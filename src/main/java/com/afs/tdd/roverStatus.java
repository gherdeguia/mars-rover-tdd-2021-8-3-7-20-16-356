package com.afs.tdd;

public class roverStatus {

    private final int xCoordinate, yCoordinate;
    private final String direction;

    public roverStatus(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    //get methods
    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public int getYCoordinate() {
        return this.yCoordinate;
    }

    public String getDirection() {
        return this.direction;
    }

    public String returnCurrentCoordinate() {
        return String.format("Current Coordinates: %d %d %s", this.getXCoordinate(), this.getYCoordinate(), this.getDirection());
    }

}
