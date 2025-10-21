package com.pluralsight;

public class Room {
    private int numOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numOfBeds = numOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumOfBeds() {
        return numOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setNumOfBeds(int numOfBeds) {
        this.numOfBeds = numOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }
    public boolean isAvailable(){
        if (!isDirty() && !isOccupied()) {
            return true;
        }
        return false;
    }
    //check in works if room is not already occupied
    // if its occupied then it will fail to check in and will print room is occupied
    public boolean checkIn() {
        if (!isOccupied) {
            isDirty = true;
            isOccupied = true;
            return true;
        } else {
            System.out.println("Room is occupied");
            return false;
        }
    }
    public boolean checkOut(){
        if (isOccupied) {
            isDirty = true;
            isOccupied = false;
            return true;
        }else {
            System.out.println("Not checked out");
            return false;
        }
    }
    public boolean cleanRoom() {
        if (!isOccupied){
            isDirty = true;
            isOccupied = false;
            return true;
        } else {
            System.out.println("Room cannot be cleaned");
            return false;
        }
    }
}

