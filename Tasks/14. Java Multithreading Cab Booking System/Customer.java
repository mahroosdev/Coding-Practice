public class Customer extends Thread {

    private String customerName;
    private Cab cab;

    public Customer(String customerName, Cab cab) {
        this.customerName = customerName;
        this.cab = cab;
    }

    @Override
    public void run() {
        cab.bookCab(customerName);
    }
}