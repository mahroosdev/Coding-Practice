import java.util.ArrayList;

public class BusReservationSystem {

    private ArrayList<Bus> buses;
    private ArrayList<Booking> bookings;

    private int nextBusId;
    private int nextBookingId;

    public BusReservationSystem() {

        buses = new ArrayList<>();
        bookings = new ArrayList<>();

        nextBusId = 1;
        nextBookingId = 1;
    }

    // Add a new bus
    public void addBus(
            String busNumber,
            String route,
            int capacity) {

        Bus bus = new Bus(
                nextBusId,
                busNumber,
                route,
                capacity
        );

        buses.add(bus);

        System.out.println();
        System.out.println("Bus added successfully.");
        System.out.println("Bus ID: " + nextBusId);

        nextBusId++;
    }

    // View all buses
    public void viewAllBuses() {

        if (buses.isEmpty()) {

            System.out.println();
            System.out.println("No buses available.");

            return;
        }

        System.out.println();
        System.out.println("========== ALL BUSES ==========");

        for (Bus bus : buses) {

            bus.displayBusDetails();
        }
    }

    // Find a bus using its ID
    private Bus findBusById(int busId) {

        for (Bus bus : buses) {

            if (bus.getBusId() == busId) {

                return bus;
            }
        }

        return null;
    }

    // Update bus capacity
    public void updateBusCapacity(
            int busId,
            int newCapacity) {

        Bus bus = findBusById(busId);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        int bookedSeats = bus.getBookedSeatCount();

        if (newCapacity < bookedSeats) {

            System.out.println();
            System.out.println(
                    "Cannot reduce capacity below the number "
                    + "of booked seats."
            );

            System.out.println(
                    "Currently booked seats: " + bookedSeats
            );

            return;
        }

        bus.updateCapacity(newCapacity);

        System.out.println();
        System.out.println("Bus capacity updated successfully.");
        System.out.println("New capacity: " + newCapacity);
    }

    // Delete a bus
    public void deleteBus(int busId) {

        Bus bus = findBusById(busId);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        // Do not delete a bus that has active bookings
        for (Booking booking : bookings) {

            if (booking.getBusId() == busId) {

                System.out.println();
                System.out.println(
                        "Cannot delete this bus because "
                        + "it has active bookings."
                );

                return;
            }
        }

        buses.remove(bus);

        System.out.println();
        System.out.println("Bus deleted successfully.");
    }

    // Book a ticket
    public void bookTicket(
            String passengerName,
            int busId) {

        Bus bus = findBusById(busId);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        if (bus.getAvailableSeats() == 0) {

            System.out.println();
            System.out.println("Sorry, no seats are available.");

            return;
        }

        int seatNumber = bus.bookSeat();

        if (seatNumber != -1) {

            Booking booking = new Booking(
                    nextBookingId,
                    passengerName,
                    busId,
                    seatNumber
            );

            bookings.add(booking);

            System.out.println();
            System.out.println("Ticket booked successfully.");
            System.out.println("Booking ID : " + nextBookingId);
            System.out.println("Seat Number: " + seatNumber);

            nextBookingId++;
        }
    }

    // View all bookings
    public void viewAllBookings() {

        if (bookings.isEmpty()) {

            System.out.println();
            System.out.println("No bookings available.");

            return;
        }

        System.out.println();
        System.out.println("======== ALL BOOKINGS ========");

        for (Booking booking : bookings) {

            booking.displayBookingDetails();
        }
    }

    // Cancel a booking
    public void cancelBooking(int bookingId) {

        Booking bookingToCancel = null;

        // Find the booking
        for (Booking booking : bookings) {

            if (booking.getBookingId() == bookingId) {

                bookingToCancel = booking;

                break;
            }
        }

        if (bookingToCancel == null) {

            System.out.println();
            System.out.println("Booking not found.");

            return;
        }

        // Find the bus
        Bus bus = findBusById(
                bookingToCancel.getBusId()
        );

        if (bus != null) {

            bus.cancelSeat(
                    bookingToCancel.getSeatNumber()
            );
        }

        // Remove the booking
        bookings.remove(bookingToCancel);

        System.out.println();
        System.out.println("Booking cancelled successfully.");
    }
}