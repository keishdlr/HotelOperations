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

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setRoomType(String roomType) {
        RoomType = roomType;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public double getPrice() {
        //
        // Price is 139 if it is a king
        // Price is 124 if it's a double
        // if(this.getRoomType().equalsIgnoreCase("king")){
        //     return 139;
        // }else{
        //            return 124;
        //  }
            return this.getRoomType().equalsIgnoreCase("king") ? 139 : 124;
    }

    public double getReservationTotal() {

       // the total is the price * the number of nights
        // if it is the weekend then the price is increased by 10%
        double total = this.getNumOfNights() * this.getPrice();

        //handle the weekend increase
        if (this.isWeekend()) {
            total += total + (total * .1);
            total = total + (total * .1);
        }

        return total;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        this.isWeekend = weekend;
    }
}


