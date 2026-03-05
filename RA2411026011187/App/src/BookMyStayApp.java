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
    }

    public static void addRoom(String roomNo){
        rooms.add(roomNo);
    }
}