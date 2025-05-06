import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Take input using Scanner class
        Scanner keyboard = new Scanner(System.in);
        // Create an object of SeatBooking class
        SeatBooking bookingManager = new SeatBooking();

        while (true) {
            System.out.println("\n1. Add Booking\n2. Cancel Booking\n3. Update Booking\n4. Display Bookings\n5. Exit");
            System.out.print("Choose an option: ");
            // Choose an option
            int choice = -1;
            try {
                choice = keyboard.nextInt();
                keyboard.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                keyboard.nextLine(); // Clear invalid input
                continue; // Skip the rest of the loop iteration
            }

            switch (choice) {
                case 1:
                    // add New Seats
                    System.out.print("Enter seat number to book: ");
                    String seatToBook = keyboard.nextLine();
                    bookingManager.addNewBooking(seatToBook);
                    break;
                case 2:
                    // remove Booking
                    System.out.print("Enter seat number to cancel: ");
                    String seatToCancel = keyboard.nextLine();
                    bookingManager.cancelBooking(seatToCancel);
                    break;
                case 3:
                    // update booking
                    System.out.print("Enter old seat number to update: ");
                    String oldSeat = keyboard.nextLine();
                    System.out.print("Enter new seat number: ");
                    String newSeat = keyboard.nextLine();
                    bookingManager.updateBooking(oldSeat, newSeat);
                    break;
                case 4:
                    // display the all bookings
                    bookingManager.displayBookings();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    keyboard.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}


