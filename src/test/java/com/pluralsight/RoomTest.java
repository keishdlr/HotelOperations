package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    // test for
    // checkIn() // room should be occupied and dirty
    // checkout()
    // cleanroom()

    @Test
    public void checkIn_shouldfail_ifoccupiedanddirty(){
        // arrange
        Room room1 = new Room(3, true, true);

        // act
        room1.checkIn();

        // assert
       assertFalse(room1.checkIn());
    }
    @Test
    public void checkOut_shouldfailif_notoccupiedordirty() {
        //arrange
        Room room2 = new Room(2, true, true);

        //act
        room2.checkOut();

        //assert
        assertFalse(room2.checkOut());
    }
    @Test
    public void cleanRoom_should_notbeoccupiedanddirty(){
        //arrange
        Room room3 = new Room(2, false, true);

        //act
        room3.cleanRoom();

        //assert
        assertTrue(room3.cleanRoom());
    }
}