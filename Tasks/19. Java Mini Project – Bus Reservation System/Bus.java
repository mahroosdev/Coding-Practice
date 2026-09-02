public class Bus {

    private int busId;
    private String busNumber;
    private String route;
    private int capacity;
    private boolean[] bookedSeats;

    public Bus(
            int busId,
            String busNumber,
            String route,
            int capacity) {

        this.busId = busId;
        this.busNumber = busNumber;
        this.route = route;
        this.capacity = capacity;

        bookedSeats = new boolean[capacity];
    }

    public int getBusId() {

        return busId;
    }

    public String getBusNumber() {

        return busNumber;
    }

    public String getRoute() {

        return route;
    }

    public int getCapacity() {

        return capacity;
    }

    // Get the number of available seats
    public int getAvailableSeats() {

        int availableSeats = 0;

        for (int i = 0; i < bookedSeats.length; i++) {

            if (!bookedSeats[i]) {

                availableSeats++;
            }
        }

        return availableSeats;
    }

    // Get the number of booked seats
    public int getBookedSeatCount() {

        int bookedSeatCount = 0;

        for (int i = 0; i < bookedSeats.length; i++) {

            if (bookedSeats[i]) {

                bookedSeatCount++;
            }
        }

        return bookedSeatCount;
    }

    // Book the first available seat
    public int bookSeat() {

        for (int i = 0; i < bookedSeats.length; i++) {

            if (!bookedSeats[i]) {

                bookedSeats[i] = true;

                return i + 1;
            }
        }

        return -1;
    }

    // Cancel a booked seat
    public boolean cancelSeat(int seatNumber) {

        if (seatNumber < 1 || seatNumber > capacity) {

            return false;
        }

        if (!bookedSeats[seatNumber - 1]) {

            return false;
        }

        bookedSeats[seatNumber - 1] = false;

        return true;
    }

    // Update the bus capacity
    public void updateCapacity(int newCapacity) {

        boolean[] newBookedSeats =
                new boolean[newCapacity];

        for (int i = 0;
             i < bookedSeats.length && i < newCapacity;
             i++) {

            newBookedSeats[i] = bookedSeats[i];
        }

        bookedSeats = newBookedSeats;

        capacity = newCapacity;
    }

    // Display bus details
    public void displayBusDetails() {

        System.out.println("--------------------------------");
        System.out.println("Bus ID          : " + busId);
        System.out.println("Bus Number      : " + busNumber);
        System.out.println("Route           : " + route);
        System.out.println("Total Capacity  : " + capacity);
        System.out.println("Available Seats : " + getAvailableSeats());
        System.out.println("--------------------------------");
    }
}