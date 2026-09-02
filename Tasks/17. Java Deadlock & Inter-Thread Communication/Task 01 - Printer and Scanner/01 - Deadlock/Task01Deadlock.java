public class Task01Deadlock {

    public static void main(String[] args) {

        Printer printer = new Printer();
        Scanner scanner = new Scanner();

        User1 user1 = new User1(printer, scanner);
        User2 user2 = new User2(printer, scanner);

        System.out.println("Starting the users...");
        System.out.println();

        user1.start();
        user2.start();
    }
}