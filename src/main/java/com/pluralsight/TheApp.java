package com.pluralsight;

public class TheApp {
    public static void main(String[] args) {
        //Testing the room

        Room room = new Room(2, 100.00, false, false);
        System.out.println("is the room available? " + isAvailable());
    }
}
