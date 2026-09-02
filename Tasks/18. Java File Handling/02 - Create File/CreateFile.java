import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        File file = new File("FileHandlingPractice/sample.txt");

        try {

            if (file.createNewFile()) {

                System.out.println("File created successfully.");

            } else {

                System.out.println("File already exists.");
            }

        } catch (IOException e) {

            System.out.println("An error occurred while creating the file.");
        }
    }
}