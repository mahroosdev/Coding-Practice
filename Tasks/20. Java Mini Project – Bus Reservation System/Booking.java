public class Booking {

    private String passengerId;
    private String passengerName;
    private String busNumber;
    private String source;
    private String destination;

    public Booking(
            String passengerId,
            String passengerName,
            String busNumber,
            String source,
            String destination) {

        this.passengerId = passengerId;
        this.passengerName = passengerName;
        this.busNumber = busNumber;
        this.source = source;
        this.destination = destination;
    }

    public String getPassengerId() {

        return passengerId;
    }

    public String getPassengerName() {

        return passengerName;
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

    // Display booking information
    public void displayBookingDetails() {

        System.out.println("----------------------------------------");
        System.out.println("Passenger ID    : " + passengerId);
        System.out.println("Passenger Name  : " + passengerName);
        System.out.println("Bus Number      : " + busNumber);
        System.out.println("Source          : " + source);
        System.out.println("Destination     : " + destination);
        System.out.println("----------------------------------------");
    }
}