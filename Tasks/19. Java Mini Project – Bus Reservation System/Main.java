import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BusReservationSystem system =
                new BusReservationSystem();

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("================================");
            System.out.println("     BUS RESERVATION SYSTEM");
            System.out.println("================================");
            System.out.println("1. Add Bus");
            System.out.println("2. View All Buses");
            System.out.println("3. Update Bus Capacity");
            System.out.println("4. Delete Bus");
            System.out.println("5. Book Ticket");
            System.out.println("6. View All Bookings");
            System.out.println("7. Cancel Booking");
            System.out.println("8. Exit");
            System.out.println("================================");

            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":

                    System.out.println();
                    System.out.println("------- ADD BUS -------");

                    System.out.print("Enter bus number: ");
                    String busNumber = scanner.nextLine();

                    System.out.print("Enter route: ");
                    String route = scanner.nextLine();

                    int capacity = readPositiveNumber(
                            scanner,
                            "Enter seating capacity: "
                    );

                    system.addBus(
                            busNumber,
                            route,
                            capacity
                    );

                    break;

                case "2":

                    system.viewAllBuses();

                    break;

                case "3":

                    System.out.println();
                    System.out.println(
                            "------- UPDATE BUS CAPACITY -------"
                    );

                    int updateBusId = readPositiveNumber(
                            scanner,
                            "Enter bus ID: "
                    );

                    int newCapacity = readPositiveNumber(
                            scanner,
                            "Enter new capacity: "
                    );

                    system.updateBusCapacity(
                            updateBusId,
                            newCapacity
                    );

                    break;

                case "4":

                    System.out.println();
                    System.out.println(
                            "------- DELETE BUS -------"
                    );

                    int deleteBusId = readPositiveNumber(
                            scanner,
                            "Enter bus ID: "
                    );

                    system.deleteBus(deleteBusId);

                    break;

                case "5":

                    System.out.println();
                    System.out.println(
                            "------- BOOK TICKET -------"
                    );

                    System.out.print("Enter passenger name: ");
                    String passengerName = scanner.nextLine();

                    int bookingBusId = readPositiveNumber(
                            scanner,
                            "Enter bus ID: "
                    );

                    system.bookTicket(
                            passengerName,
                            bookingBusId
                    );

                    break;

                case "6":

                    system.viewAllBookings();

                    break;

                case "7":

                    System.out.println();
                    System.out.println(
                            "------- CANCEL BOOKING -------"
                    );

                    int bookingId = readPositiveNumber(
                            scanner,
                            "Enter booking ID: "
                    );

                    system.cancelBooking(bookingId);

                    break;

                case "8":

                    System.out.println();
                    System.out.println(
                            "Thank you for using the Bus Reservation System."
                    );

                    running = false;

                    break;

                default:

                    System.out.println();
                    System.out.println(
                            "Invalid choice. Please enter a number from 1 to 8."
                    );
            }
        }

        scanner.close();
    }

    // Read a positive integer from the user
    public static int readPositiveNumber(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine();

            try {

                int number = Integer.parseInt(input);

                if (number > 0) {

                    return number;
                }

                System.out.println(
                        "Please enter a number greater than 0."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. Please enter a number."
                );
            }
        }
    }
}