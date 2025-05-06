import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SeatBooking {
    
    private List<Seat> bookedSeatsList;
    
    public SeatBooking() {
        this.bookedSeatsList = new ArrayList<>();
    }
    
    public void addNewBooking(String seatNumber) {
        
        for (Seat existingSeat : bookedSeatsList) {
            if (existingSeat.getSeatNumber().equals(seatNumber) && existingSeat.isBooked() && !existingSeat.isCanceled()) {
                System.out.println("Seat " + seatNumber + " is already booked.");
                return;
            }
        }

        Seat newSeat = new Seat(seatNumber);
        newSeat.setBooked(true);
        newSeat.setBookingDate(new Date());
        newSeat.setCanceled(false);
        
        this.bookedSeatsList.add(newSeat);
        
        System.out.println("Seat " + seatNumber + " booked successfully on " + newSeat.getBookingDate());
     }
    
    public void cancelBooking(String seatNumber) {
        
        for (Seat seat : bookedSeatsList) {
            if (seat.getSeatNumber().equals(seatNumber) && seat.isBooked() && !seat.isCanceled()) {
                
                seat.setCanceled(true);
                seat.setBooked(false);
                System.out.println("Booking for seat " + seatNumber + " canceled successfully.");
                return;
            }
        }
        
        System.out.println("No active booking found for seat " + seatNumber + " to cancel.");
    }
    
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {
        
        for (Seat seat : bookedSeatsList) {
            
            if (seat.getSeatNumber().equals(oldSeatNumber) && seat.isBooked() && !seat.isCanceled()) {
                
                seat.setSeatNumber(newSeatNumber);
                
                System.out.println("Booking updated from seat " + oldSeatNumber + " to " + newSeatNumber + " successfully.");
                return;
            }
        }
        
        System.out.println("No active booking found for seat " + oldSeatNumber + " to update.");
    }
    
    public void displayBookings() {
        
        if (bookedSeatsList.isEmpty()) {
            System.out.println("No bookings have been made yet.");
            return;
        }
        System.out.println("Current Bookings:");
        boolean foundActiveBookings = false;
        
        for (Seat seat : bookedSeatsList) {
            if (seat.isBooked() && !seat.isCanceled()) {
                
                System.out.println("Seat: " + seat.getSeatNumber() + ", Booked on: " + seat.getBookingDate());
                foundActiveBookings = true;
            }
        }
        if (!foundActiveBookings) {
            System.out.println("No active bookings found.");
        }
    }
}
