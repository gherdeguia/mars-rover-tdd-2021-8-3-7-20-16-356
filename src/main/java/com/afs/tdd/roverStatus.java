package com.afs.tdd;

public class roverStatus {

    private int xCoordinate, yCoordinate;
    private String direction;

    public roverStatus(int xCoordinate, int yCoordinate, String direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    //get methods
    public int getXCoordinate(){
        return this.xCoordinate;
    }
    public int getYCoordinate(){
        return this.yCoordinate;
    }
    public String getDirection(){
        return this.direction;
    }
    public String returnCurrentCoordinate(){
        return String.format("%d %d %s",this.getXCoordinate(),this.getYCoordinate(),this.getDirection());
    }

    //set methods
    public void setXCoordinate(int xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    public void setDirection(String direction){
        this.direction = direction;
    }


}
