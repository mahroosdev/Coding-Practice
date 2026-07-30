public class NumberLogicTask07 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40};

        System.out.println("Duplicate elements:");

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] == numbers[j]) {

                    System.out.println(numbers[i]);

                    break;
                }
            }
        }
    }
}