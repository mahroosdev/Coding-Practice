import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        File file = new File(
                "FileHandlingPractice/sample.txt"
        );

        Scanner scanner = null;

        try {

            scanner = new Scanner(file);

            System.out.println("File content:");
            System.out.println();

            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            System.out.println("File could not be found.");

        } finally {

            if (scanner != null) {

                scanner.close();
            }
        }
    }
}