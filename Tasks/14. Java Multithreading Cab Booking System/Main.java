public class Main {

    public static void main(String[] args) {

        Cab cab = new Cab();

        Customer customer1 = new Customer("Customer 1", cab);
        Customer customer2 = new Customer("Customer 2", cab);
        Customer customer3 = new Customer("Customer 3", cab);

        System.out.println("===== Cab Booking System =====");
        System.out.println();

        customer1.start();
        customer2.start();
        customer3.start();
    }
}