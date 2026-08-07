public class NumberPrinter {

    // Prints odd numbers without mixing output
    public synchronized void printOddNumbers() {

        System.out.println("Odd Numbers:");

        for (int number = 1; number <= 10; number += 2) {

            System.out.println(number);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        System.out.println();
    }

    // Prints even numbers without mixing output
    public synchronized void printEvenNumbers() {

        System.out.println("Even Numbers:");

        for (int number = 2; number <= 10; number += 2) {

            System.out.println(number);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }

        System.out.println();
    }
}