import java.util.ArrayList;

public class BookMyStayApp {

    static ArrayList<String> rooms = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("       Welcome to BookMyStay     ");
        System.out.println("=================================");
        System.out.println("Hotel Booking Management System");

        // UC2 Logic
        addRoom("101");
        addRoom("102");

        System.out.println("\nAvailable Rooms:");
        for(String room : rooms){
            System.out.println("Room No: " + room);
        }

        // UC3 Logic
        System.out.println("\nBooking Room 101...");
        bookRoom("101");

        System.out.println("\nRooms after booking:");
        for(String room : rooms){
            System.out.println("Room No: " + room);
        }

        // UC4 Logic
        System.out.println("\nCancelling booking for Room 101...");
        cancelBooking("101");

        System.out.println("\nRooms after cancellation:");
        for(String room : rooms){
            System.out.println("Room No: " + room);
        }
    }

    public static void addRoom(String roomNo){
        rooms.add(roomNo);
    }

    public static void bookRoom(String roomNo){
        if(rooms.contains(roomNo)){
            rooms.remove(roomNo);
            System.out.println("Room " + roomNo + " booked successfully!");
        } else {
            System.out.println("Room not available.");
        }
    }

    public static void cancelBooking(String roomNo){
        rooms.add(roomNo);
        System.out.println("Booking for room " + roomNo + " cancelled.");
    }
}