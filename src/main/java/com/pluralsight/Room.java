package com.pluralsight;

public class Room {
    private int roomNumber;
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfBeds() {
            return numberOfBeds;
        }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return Room.this.dirty;
    }

    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public Room() {
    }

    public Room(int roomNumber, int numberOfBeds, double price, boolean occupied, boolean isDirty) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = isDirty;

    }

    public void checkIn() {
        occupied = true;
        dirty = true;

        System.out.printf("Room %d checked in!\n", getRoomNumber());

    }
    public void checkOut() {
        System.out.printf("\nRoom %d checked out. Housekeeping needs to clean room.\n", getRoomNumber());

        occupied = false;

    }
    public void cleanRoom() {
        System.out.println("""
                \nHas the room been cleaned yet?
                
                1) Yes
                2) No
                """);

        int command = Console.promptForInt("Enter your command: ");

        switch (command) {
            case 1 -> {
                dirty = false;
                System.out.printf("Room %d cleaned. Room is now available for reservation.\n", getRoomNumber());
            }
            case 2 -> {
                System.out.println("Please schedule housekeeping for room cleanup.\n");
            }
        }
    }
    public String toString() {
        return String.format("""
        +-------------------------------------------------------------------------------------------+
        | Room: %d | Beds: %d  | Price: %.2f | Occupied: %b | Dirty: %b | Available: %b  |
        +-------------------------------------------------------------------------------------------+""",
                getRoomNumber(), getNumberOfBeds(), getPrice(), isOccupied(), isDirty(), isAvailable());
    }

}
