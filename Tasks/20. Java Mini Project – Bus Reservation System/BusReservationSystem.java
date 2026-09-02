import java.util.ArrayList;

public class BusReservationSystem {

    private ArrayList<Bus> buses;
    private ArrayList<Booking> bookings;

    public BusReservationSystem() {

        buses = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    // Add a new bus
    public void addBus(
            String busNumber,
            String source,
            String destination,
            int capacity) {

        // Check whether the bus number already exists
        if (findBusByNumber(busNumber) != null) {

            System.out.println();
            System.out.println(
                    "Error: A bus with this number already exists."
            );

            return;
        }

        Bus bus = new Bus(
                busNumber,
                source,
                destination,
                capacity
        );

        buses.add(bus);

        System.out.println();
        System.out.println("Bus added successfully.");
    }

    // View all buses
    public void viewAllBuses() {

        if (buses.isEmpty()) {

            System.out.println();
            System.out.println("No buses are available.");

            return;
        }

        System.out.println();
        System.out.println("========== ALL BUSES ==========");

        for (Bus bus : buses) {

            bus.displayBusDetails();
        }
    }

    // Find a bus using its bus number
    private Bus findBusByNumber(String busNumber) {

        for (Bus bus : buses) {

            if (bus.getBusNumber().equalsIgnoreCase(busNumber)) {

                return bus;
            }
        }

        return null;
    }

    // Search for a bus
    public void searchBus(String busNumber) {

        Bus bus = findBusByNumber(busNumber);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        System.out.println();
        System.out.println("Bus found:");

        bus.displayBusDetails();
    }

    // Update bus capacity
    public void updateBusCapacity(
            String busNumber,
            int newCapacity) {

        Bus bus = findBusByNumber(busNumber);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        // New capacity cannot be less than booked seats
        if (newCapacity < bus.getBookedSeats()) {

            System.out.println();
            System.out.println(
                    "Error: New capacity cannot be less than "
                    + "the number of booked seats."
            );

            System.out.println(
                    "Currently booked seats: "
                    + bus.getBookedSeats()
            );

            return;
        }

        bus.updateCapacity(newCapacity);

        System.out.println();
        System.out.println(
                "Bus capacity updated successfully."
        );
    }

    // Delete a bus
    public void deleteBus(String busNumber) {

        Bus bus = findBusByNumber(busNumber);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        // Check whether the bus has bookings
        for (Booking booking : bookings) {

            if (booking.getBusNumber()
                    .equalsIgnoreCase(busNumber)) {

                System.out.println();
                System.out.println(
                        "Error: This bus cannot be deleted "
                        + "because it has active bookings."
                );

                return;
            }
        }

        buses.remove(bus);

        System.out.println();
        System.out.println("Bus deleted successfully.");
    }

    // Check whether a passenger ID already exists
    private boolean passengerIdExists(String passengerId) {

        for (Booking booking : bookings) {

            if (booking.getPassengerId()
                    .equalsIgnoreCase(passengerId)) {

                return true;
            }
        }

        return false;
    }

    // Book a ticket
    public void bookTicket(
            String passengerId,
            String passengerName,
            String busNumber) {

        // Check passenger ID uniqueness
        if (passengerIdExists(passengerId)) {

            System.out.println();
            System.out.println(
                    "Error: This Passenger ID is already used."
            );

            return;
        }

        // Find the selected bus
        Bus bus = findBusByNumber(busNumber);

        if (bus == null) {

            System.out.println();
            System.out.println("Bus not found.");

            return;
        }

        // Check seat availability
        if (bus.getAvailableSeats() == 0) {

            System.out.println();
            System.out.println(
                    "Sorry, no seats are available on this bus."
            );

            return;
        }

        // Book one seat
        if (bus.bookSeat()) {

            Booking booking = new Booking(
                    passengerId,
                    passengerName,
                    bus.getBusNumber(),
                    bus.getSource(),
                    bus.getDestination()
            );

            bookings.add(booking);

            System.out.println();
            System.out.println(
                    "Ticket booked successfully."
            );

            System.out.println(
                    "Passenger ID: " + passengerId
            );

            System.out.println(
                    "Bus Number: " + bus.getBusNumber()
            );

            System.out.println(
                    "Booked Seats: " + bus.getBookedSeats()
            );

            System.out.println(
                    "Available Seats: " + bus.getAvailableSeats()
            );
        }
    }

    // View all bookings
    public void viewAllBookings() {

        if (bookings.isEmpty()) {

            System.out.println();
            System.out.println("No bookings are available.");

            return;
        }

        System.out.println();
        System.out.println("======== ALL BOOKINGS ========");

        for (Booking booking : bookings) {

            booking.displayBookingDetails();
        }
    }

    // Cancel a booking using Passenger ID
    public void cancelBooking(String passengerId) {

        Booking bookingToCancel = null;

        // Find the booking
        for (Booking booking : bookings) {

            if (booking.getPassengerId()
                    .equalsIgnoreCase(passengerId)) {

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
        Bus bus = findBusByNumber(
                bookingToCancel.getBusNumber()
        );

        if (bus != null) {

            bus.cancelSeat();
        }

        // Remove the booking
        bookings.remove(bookingToCancel);

        System.out.println();
        System.out.println(
                "Booking cancelled successfully."
        );

        System.out.println(
                "Passenger ID: " + passengerId
        );

        if (bus != null) {

            System.out.println(
                    "Available Seats: "
                    + bus.getAvailableSeats()
            );
        }
    }
}