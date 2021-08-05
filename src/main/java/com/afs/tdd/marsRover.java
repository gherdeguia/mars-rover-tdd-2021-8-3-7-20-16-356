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
        switch (command){
            case "M" :
                moveForward();
                break;
            case "L" :
                turnLeft();
                break;
            case "R" :
                turnRight();
                break;
            default:
        }


    }

    public void moveForward(){
        final int xCoordinate = this.currentRover.getXCoordinate();
        final int yCoordinate = this.currentRover.getYCoordinate();
        final String direction = this.currentRover.getDirection();
        currentRover = new roverStatus(xCoordinate,yCoordinate+1,direction);
    }

    public void turnLeft(){
        final int xCoordinate = this.currentRover.getXCoordinate();
        final int yCoordinate = this.currentRover.getYCoordinate();
        final String direction = this.currentRover.getDirection();
        String newDirection = turningLeft(direction);
        currentRover = new roverStatus(xCoordinate,yCoordinate,newDirection);
    }

    public void turnRight(){
        final int xCoordinate = this.currentRover.getXCoordinate();
        final int yCoordinate = this.currentRover.getYCoordinate();
        final String direction = this.currentRover.getDirection();
        String newDirection = turningRight(direction);
        currentRover = new roverStatus(xCoordinate,yCoordinate,newDirection);
    }

    public String turningLeft(String currentDirection){
        String newDirection = currentDirection;
        switch (currentDirection){
            case "N" :
                newDirection = "W";
                break;
            case "W" :
                newDirection = "S";
                break;
            case "S" :
                newDirection = "E";
                break;
            case "E" :
                newDirection = "N";
                break;
            default:
        }
        return newDirection;
    }

    public String turningRight(String currentDirection){
        String newDirection = currentDirection;
        switch (currentDirection){
            case "N" :
                newDirection = "E";
                break;
            case "E" :
                newDirection = "S";
                break;
            case "S" :
                newDirection = "W";
                break;
            case "W" :
                newDirection = "N";
                break;
            default:
        }
        return newDirection;
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
