public class ArrayTask02 {

    public static void main(String[] args) {

        int[] numbers = {10, 25, 8, 40, 15};

        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest number: " + smallest);
    }
}