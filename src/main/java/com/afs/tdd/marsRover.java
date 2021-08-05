package com.afs.tdd;

public class marsRover {

    private roverStatus currentRover;

    public marsRover(roverStatus rover){
        this.currentRover = rover;
    }

    public void executeCommand(String command) {
        if(command.equals("M")){
            moveForward();
        }
    }

    public void moveForward(){
        final int xCoordinate = this.currentRover.getXCoordinate();
        final int yCoordinate = this.currentRover.getYCoordinate();
        final String direction = this.currentRover.getDirection();
        currentRover = new roverStatus(xCoordinate,yCoordinate+1,direction);
    }

    public int getXCoordinate(){
        return this.currentRover.getXCoordinate();
    }

    public int getYCoordinate(){
        return this.currentRover.getYCoordinate();
    }

    public String getDirection(){
        return this.currentRover.getDirection();
    }

    public String getRoverStatus(){
        return this.getRoverStatus();
    }




}
