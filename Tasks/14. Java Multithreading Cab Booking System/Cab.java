public class Cab {

    private boolean available = true;

    public synchronized void bookCab(String customerName) {

        if (available) {
            System.out.println(customerName + " is trying to book the cab...");

            available = false;

            System.out.println(customerName + " successfully booked the cab.");
        } else {
            System.out.println(
                customerName + " failed to book the cab. Cab is already booked."
            );
        }
    }
}