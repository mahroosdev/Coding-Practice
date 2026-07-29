public class ArrayTask09 {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40};

        int[] newArray = new int[numbers.length];

        int newSize = 0;

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < newSize; j++) {

                if (numbers[i] == newArray[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate == false) {

                newArray[newSize] = numbers[i];

                newSize = newSize + 1;
            }
        }

        System.out.println("Array without duplicates:");

        for (int i = 0; i < newSize; i++) {

            System.out.print(newArray[i] + " ");
        }
    }
}