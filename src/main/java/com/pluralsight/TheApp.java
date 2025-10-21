package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {
        //Testing the room logic
        Room room = new Room(2, 100.00, false, false);
        System.out.println("is the room available? " + room.isAvailable());
        //Testing the employee
        Employee employee1 = new Employee(1, "Keisha De La Rosa", "Software", 25, 40);
        System.out.println(employee1);
        //Testing the reservation
        Reservation reservation001 = new Reservation("double", 2,false);
        System.out.println(reservation001);

    }
}
