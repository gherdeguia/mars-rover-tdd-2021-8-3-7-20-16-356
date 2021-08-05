package com.afs.tdd;

public class marsRover {

    private int xCoordinate, yCoordinate;
    private String direction, command;
    private roverStatus currentRover;

    public marsRover(roverStatus rover){
        this.currentRover = rover;
    }

    public static String executeCommand(String m) {
        return "";
    }

    public int getXCoordinate(){
        return this.currentRover.getXCoordinate();
    }

    public int getYCoordinate(){
        return this.currentRover.getYCoordinate();
    }

    public String getDirection(){
        return this.direction;
    }

    public String getCommand(){
        return this.command;
    }

    public String getRoverStatus(){
        return this.getRoverStatus();
    }

}
