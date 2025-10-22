package com.pluralsight;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    //test for employee punch in
    public void punchIn(){
        //arrange
        Employee employee1 = new Employee("AJ");

        //act
        employee1.punchIn();
        double punchTime = employee1.punchIn();

        // Assert
        assertNotNull(punchTime, "Punch-in time should not be empty");
    }

    //test for employee punchout
    @Test
    public void punchOut(){
        //arrange
        Employee employee2 = new Employee("Juan");

        //act
        employee2.punchOut();
        double punchTime = employee2.punchOut();

        //assert
        assertNotNull(punchTime, "Punch out should not be empty");
    }
}

