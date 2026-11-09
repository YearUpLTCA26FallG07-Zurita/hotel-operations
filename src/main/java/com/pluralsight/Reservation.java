package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;


    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getPrice() {
        if (!isWeekend) {
            if (this.roomType.equalsIgnoreCase("king")) {
                return 139.00;
            } else if (this.roomType.equalsIgnoreCase("queen")) {
                return 124.00;
            }
        } else {
            if (this.roomType.equalsIgnoreCase("king")) {
                return 139.00 + 139.00 * 0.10;
            } else if (this.roomType.equalsIgnoreCase("queen")) {
                return 124.00 + 124.00 * 0.10;
            }
        }
        return 0;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend, double reservationTotal) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

    }
}
