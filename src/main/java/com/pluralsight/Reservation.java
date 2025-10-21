package com.pluralsight;

public class Reservation {

    // stores info for a guest stay
    private String RoomType;
    private double price;
    private int numOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numOfNights, boolean isWeekend, double reservationTotal) {
        RoomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
    }

    public String getRoomType() {
        return RoomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public double getReservationTotal() {
        return reservationTotal;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
}
