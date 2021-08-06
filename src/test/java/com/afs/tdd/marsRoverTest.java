package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class marsRoverTest {
    @Test
    void should_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedStatus = new roverStatus(0,1,"N");

        //when
        Curiosity.executeCommand("M");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_N_and_L() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedStatus = new roverStatus(0,0,"W");

        //when
        Curiosity.executeCommand("L");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_N_and_R() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedStatus = new roverStatus(0,0,"E");

        //when
        Curiosity.executeCommand("R");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_Neg1_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_S_and_M() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"S"));
        roverStatus expectedStatus = new roverStatus(0,-1,"S");

        //when
        Curiosity.executeCommand("M");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_S_and_L() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"S"));
        roverStatus expectedStatus = new roverStatus(0,0,"E");

        //when
        Curiosity.executeCommand("L");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_S_and_R() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"S"));
        roverStatus expectedStatus = new roverStatus(0,0,"W");

        //when
        Curiosity.executeCommand("R");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_1_locationY_0_direction_E_when_execute_command_given_locationX_0_locationY_0_direction_E_and_M() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"E"));
        roverStatus expectedStatus = new roverStatus(1,0,"E");

        //when
        Curiosity.executeCommand("M");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_E_and_L() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"E"));
        roverStatus expectedStatus = new roverStatus(0,0,"N");

        //when
        Curiosity.executeCommand("L");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_E_and_R() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"E"));
        roverStatus expectedStatus = new roverStatus(0,0,"S");

        //when
        Curiosity.executeCommand("R");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_Neg1_locationY_0_direction_W_when_execute_command_given_locationX_0_locationY_0_direction_W_and_M() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"W"));
        roverStatus expectedStatus = new roverStatus(-1,0,"W");

        //when
        Curiosity.executeCommand("M");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_S_when_execute_command_given_locationX_0_locationY_0_direction_W_and_L() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"W"));
        roverStatus expectedStatus = new roverStatus(0,0,"S");

        //when
        Curiosity.executeCommand("L");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_locationX_0_locationY_0_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_W_and_R() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"W"));
        roverStatus expectedStatus = new roverStatus(0,0,"N");

        //when
        Curiosity.executeCommand("R");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }

    @Test
    void should_rover_move_to_location_when_execute_commands_given_full_command_string() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedStatus = new roverStatus(1,2,"S");

        //when
        Curiosity.executeCommands("0 0 N  MMRMR");

        //then
        assertEquals(expectedStatus.returnCurrentCoordinate(),Curiosity.returnCurrentCoordinate());
    }
}
