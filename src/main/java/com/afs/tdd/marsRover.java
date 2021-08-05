package com.afs.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.Integer.valueOf;

public class marsRover {

    private roverStatus currentRover;
    private String commandString;

    public marsRover(roverStatus rover) {
        this.currentRover = rover;
    }

    public void executeCommands(String command) {
        parseCommand(command);
        int commandLength = this.commandString.length();

        for (int x = 0; x < commandLength; x++) {
            executeCommand(commandString.charAt(x) + "");
        }
    }

    public void parseCommand(String command) {
        String[] parsedCommands = command.split("  ");
        String[] parsedCoordinates = parsedCommands[0].split(" ");
        int xCoordinate = Integer.parseInt(parsedCoordinates[0]);
        int yCoordinate = Integer.parseInt(parsedCoordinates[1]);
        String direction = parsedCoordinates[2];
        this.currentRover = new roverStatus(xCoordinate, yCoordinate, direction);
        this.commandString = parsedCommands[1];
    }

    public void executeCommand(String command) {
        switch (command) {
            case "M":
                moveForward();
                break;
            case "L":
                turnLeft();
                break;
            case "R":
                turnRight();
                break;
            default:
        }

        getRoverStatus();
    }

    public void moveForward() {
        int xCoordinate = this.currentRover.getXCoordinate();
        int yCoordinate = this.currentRover.getYCoordinate();
        String direction = this.currentRover.getDirection();

        switch (direction) {
            case "N":
                yCoordinate++;
                break;
            case "W":
                xCoordinate--;
                break;
            case "S":
                yCoordinate--;
                break;
            case "E":
                xCoordinate++;
                break;
            default:
        }
        currentRover = new roverStatus(xCoordinate, yCoordinate, direction);
    }

    public void turnLeft() {
        final int xCoordinate = this.currentRover.getXCoordinate();
        final int yCoordinate = this.currentRover.getYCoordinate();
        final String direction = this.currentRover.getDirection();
        String newDirection = turningLeft(direction);
        currentRover = new roverStatus(xCoordinate, yCoordinate, newDirection);
    }

    public void turnRight() {
        final int xCoordinate = this.currentRover.getXCoordinate();
        final int yCoordinate = this.currentRover.getYCoordinate();
        final String direction = this.currentRover.getDirection();
        String newDirection = turningRight(direction);
        currentRover = new roverStatus(xCoordinate, yCoordinate, newDirection);
    }

    public String turningLeft(String currentDirection) {
        String newDirection = currentDirection;
        switch (currentDirection) {
            case "N":
                newDirection = "W";
                break;
            case "W":
                newDirection = "S";
                break;
            case "S":
                newDirection = "E";
                break;
            case "E":
                newDirection = "N";
                break;
            default:
        }
        return newDirection;
    }

    public String turningRight(String currentDirection) {
        String newDirection = currentDirection;
        switch (currentDirection) {
            case "N":
                newDirection = "E";
                break;
            case "E":
                newDirection = "S";
                break;
            case "S":
                newDirection = "W";
                break;
            case "W":
                newDirection = "N";
                break;
            default:
        }
        return newDirection;
    }

    public int getXCoordinate() {
        return this.currentRover.getXCoordinate();
    }

    public int getYCoordinate() {
        return this.currentRover.getYCoordinate();
    }

    public String getDirection() {
        return this.currentRover.getDirection();
    }

    public void getRoverStatus() {
        System.out.println(this.currentRover.returnCurrentCoordinate());
    }


}
