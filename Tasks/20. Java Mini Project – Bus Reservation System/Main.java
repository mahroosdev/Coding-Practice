import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BusReservationSystem system =
                new BusReservationSystem();

        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("========================================");
            System.out.println("       BUS RESERVATION SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Bus");
            System.out.println("2. View All Buses");
            System.out.println("3. Update Bus Capacity");
            System.out.println("4. Delete Bus");
            System.out.println("5. Search Bus");
            System.out.println("6. Book Ticket");
            System.out.println("7. View All Bookings");
            System.out.println("8. Cancel Booking");
            System.out.println("9. Exit");
            System.out.println("========================================");

            System.out.print("Enter your choice: ");

            String choice = scanner.nextLine();

            switch (choice) {

                case "1":

                    System.out.println();
                    System.out.println("----------- ADD BUS -----------");

                    String busNumber = readText(
                            scanner,
                            "Enter bus number: "
                    );

                    String source = readText(
                            scanner,
                            "Enter source: "
                    );

                    String destination = readText(
                            scanner,
                            "Enter destination: "
                    );

                    int capacity = readPositiveNumber(
                            scanner,
                            "Enter capacity: "
                    );

                    system.addBus(
                            busNumber,
                            source,
                            destination,
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

                    String updateBusNumber = readText(
                            scanner,
                            "Enter bus number: "
                    );

                    int newCapacity = readPositiveNumber(
                            scanner,
                            "Enter new capacity: "
                    );

                    system.updateBusCapacity(
                            updateBusNumber,
                            newCapacity
                    );

                    break;

                case "4":

                    System.out.println();
                    System.out.println(
                            "----------- DELETE BUS -----------"
                    );

                    String deleteBusNumber = readText(
                            scanner,
                            "Enter bus number: "
                    );

                    system.deleteBus(deleteBusNumber);

                    break;

                case "5":

                    System.out.println();
                    System.out.println(
                            "----------- SEARCH BUS -----------"
                    );

                    String searchBusNumber = readText(
                            scanner,
                            "Enter bus number: "
                    );

                    system.searchBus(searchBusNumber);

                    break;

                case "6":

                    System.out.println();
                    System.out.println(
                            "----------- BOOK TICKET -----------"
                    );

                    String passengerId = readText(
                            scanner,
                            "Enter passenger ID: "
                    );

                    String passengerName = readText(
                            scanner,
                            "Enter passenger name: "
                    );

                    String bookingBusNumber = readText(
                            scanner,
                            "Enter bus number: "
                    );

                    system.bookTicket(
                            passengerId,
                            passengerName,
                            bookingBusNumber
                    );

                    break;

                case "7":

                    system.viewAllBookings();

                    break;

                case "8":

                    System.out.println();
                    System.out.println(
                            "--------- CANCEL BOOKING ---------"
                    );

                    String cancelPassengerId = readText(
                            scanner,
                            "Enter passenger ID: "
                    );

                    system.cancelBooking(
                            cancelPassengerId
                    );

                    break;

                case "9":

                    System.out.println();
                    System.out.println(
                            "Thank you for using the "
                            + "Bus Reservation System."
                    );

                    running = false;

                    break;

                default:

                    System.out.println();
                    System.out.println(
                            "Invalid choice."
                    );

                    System.out.println(
                            "Please enter a number from 1 to 9."
                    );
            }
        }

        scanner.close();
    }

    // Read text input
    public static String readText(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

            if (!input.isEmpty()) {

                return input;
            }

            System.out.println(
                    "Input cannot be empty."
            );
        }
    }

    // Read a positive number
    public static int readPositiveNumber(
            Scanner scanner,
            String message) {

        while (true) {

            System.out.print(message);

            String input = scanner.nextLine().trim();

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