package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        int roomNumber = Console.promptForInt("Enter room number: ");

        Room room1 = new Room(roomNumber, 1, 200.00, false, false);

        System.out.println(room1);

        while (true) {
            System.out.println("""
                What would you like to do?
                
                1) Check in
                2) Check out
                3) Clean room
                
                0) Exit""");

            int command = Console.promptForInt("\nEnter your command: ");
            switch (command) {
                case 1 -> {
                    room1.checkIn();
                    System.out.println(room1);
                }
                case 2 -> {
                    room1.checkOut();
                    System.out.println(room1);
                }
                case 3 -> {
                    room1.cleanRoom();
                    System.out.println(room1);
                }
                case 0 -> {return;}
                default -> System.out.println("Enter valid number.");
            }
        }
    }
}