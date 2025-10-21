package com.pluralsight;

public class Reservation {

    // stores info for a guest stay
    private String RoomType;
    private double price;
    private int numOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, double price, int numOfNights, boolean isWeekend) {
        RoomType = roomType;
        this.price = price;
        this.numOfNights = numOfNights;
        this.isWeekend = isWeekend;
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

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    public double getReservationTotal() {
        Switch (RoomType){
        case double:
            price = 124.00;
            if (isWeekend == true){
                reservationTotal = ( price * .10) * numOfNights;}
            else {
                reservationTotal = price * numOfNights;}
            break;
        case king:
            price = 139.00;
        if (isWeekend == true){
            reservationTotal = ( price * .10) * numOfNights;}
        else {
            reservationTotal = price * numOfNights;}
            break;

        return reservationTotal;
    }}
}
