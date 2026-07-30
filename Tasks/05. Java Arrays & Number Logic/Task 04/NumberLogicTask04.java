public class NumberLogicTask04 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Original array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        for (int i = 0; i < numbers.length / 2; i++) {

            int temp = numbers[i];

            numbers[i] = numbers[numbers.length - 1 - i];

            numbers[numbers.length - 1 - i] = temp;
        }

        System.out.println();
        System.out.println("Reversed array:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}