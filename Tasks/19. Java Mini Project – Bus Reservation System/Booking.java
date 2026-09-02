public class Booking {

    private int bookingId;
    private String passengerName;
    private int busId;
    private int seatNumber;

    public Booking(
            int bookingId,
            String passengerName,
            int busId,
            int seatNumber) {

        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.busId = busId;
        this.seatNumber = seatNumber;
    }

    public int getBookingId() {
        return bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getBusId() {
        return busId;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void displayBookingDetails() {

        System.out.println("--------------------------------");
        System.out.println("Booking ID     : " + bookingId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Bus ID         : " + busId);
        System.out.println("Seat Number    : " + seatNumber);
        System.out.println("--------------------------------");
    }
}