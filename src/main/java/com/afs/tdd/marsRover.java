package com.afs.tdd;

public class marsRover {

    private roverStatus currentRover;
    private String commandString;

    private final String NORTH = "N";
    private final String EAST = "E";
    private final String WEST = "W";
    private final String SOUTH = "S";

    public marsRover(roverStatus rover) {
        this.currentRover = rover;
    }

    public void parseCommand(String command) {
        String[] parsedCommands = command.split(" {2}");
        String[] parsedCoordinates = parsedCommands[0].split(" ");
        int xCoordinate = Integer.parseInt(parsedCoordinates[0]);
        int yCoordinate = Integer.parseInt(parsedCoordinates[1]);
        String direction = parsedCoordinates[2];
        this.currentRover = new roverStatus(xCoordinate, yCoordinate, direction);
        this.commandString = parsedCommands[1];
    }

    public void executeCommands(String command) {
        parseCommand(command);

        if(commandString != ""){
            String[] commandList = commandString.split("");
            for (String singleCommand: commandList) {
                executeCommand((singleCommand));
            }
        }else{
            executeCommand(command);
        }

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
                newDirection = WEST;
                break;
            case "W":
                newDirection = SOUTH;
                break;
            case "S":
                newDirection = EAST;
                break;
            case "E":
                newDirection = NORTH;
                break;
            default:
        }
        return newDirection;
    }

    public String turningRight(String currentDirection) {
        String newDirection = currentDirection;
        switch (currentDirection) {
            case "N":
                newDirection = EAST;
                break;
            case "E":
                newDirection = SOUTH;
                break;
            case "S":
                newDirection = WEST;
                break;
            case "W":
                newDirection = NORTH;
                break;
            default:
        }
        return newDirection;
    }

    public void getRoverStatus() {
        System.out.println(this.currentRover.returnCurrentCoordinate());
    }

    public String returnCurrentCoordinate(){
        return this.currentRover.returnCurrentCoordinate();
    }
}
