public class ArrayTask08 {

    public static void main(String[] args) {

        int[] numbers = {10, 40, 20, 50, 30};

        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        int secondLargest = numbers[0];

        if (secondLargest == largest) {
            secondLargest = numbers[1];
        }

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > secondLargest && numbers[i] < largest) {

                secondLargest = numbers[i];
            }
        }

        System.out.println("Largest number: " + largest);
        System.out.println("Second largest number: " + secondLargest);
    }
}