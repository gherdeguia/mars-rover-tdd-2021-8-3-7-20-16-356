package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/*
    Test Cases
    0 1 N  M
    0 0 W  L
    0 0 E  R
*/

public class marsRoverTest {
    @Test
    void should_locationX_0_locationY_1_direction_N_when_execute_command_given_locationX_0_locationY_0_direction_N_and_M() {
        //given
        marsRover Curiosity = new marsRover(new roverStatus(0,0,"N"));
        roverStatus expectedStatus = new roverStatus(0,1,"N");

        //when
        Curiosity.executeCommand("M");

        //then
        assertEquals(expectedStatus.getYCoordinate(), Curiosity.getYCoordinate());
    }


}
