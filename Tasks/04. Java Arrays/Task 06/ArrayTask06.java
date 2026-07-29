public class ArrayTask06 {

    public static void main(String[] args) {

        int[] numbers = {10, 7, 4, 9, 12, 5};

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                evenCount = evenCount + 1;

            } else {

                oddCount = oddCount + 1;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}