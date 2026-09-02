public class Bus {

    private String busNumber;
    private String source;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public Bus(
            String busNumber,
            String source,
            String destination,
            int capacity) {

        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getBusNumber() {

        return busNumber;
    }

    public String getSource() {

        return source;
    }

    public String getDestination() {

        return destination;
    }

    public int getCapacity() {

        return capacity;
    }

    public int getBookedSeats() {

        return bookedSeats;
    }

    public int getAvailableSeats() {

        return capacity - bookedSeats;
    }

    // Increase the booked seat count by one
    public boolean bookSeat() {

        if (bookedSeats < capacity) {

            bookedSeats++;

            return true;
        }

        return false;
    }

    // Decrease the booked seat count by one
    public boolean cancelSeat() {

        if (bookedSeats > 0) {

            bookedSeats--;

            return true;
        }

        return false;
    }

    // Update the bus capacity
    public void updateCapacity(int newCapacity) {

        capacity = newCapacity;
    }

    // Display bus information
    public void displayBusDetails() {

        System.out.println("----------------------------------------");
        System.out.println("Bus Number      : " + busNumber);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("Capacity        : " + capacity);
        System.out.println("Booked Seats    : " + bookedSeats);
        System.out.println("Available Seats : " + getAvailableSeats());
        System.out.println("----------------------------------------");
    }
}