import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {

        FileWriter writer = null;

        try {

            writer = new FileWriter(
                    "FileHandlingPractice/sample.txt"
            );

            writer.write("Hello, this is my first file.");
            writer.write("\n");
            writer.write("I am learning Java File Handling.");
            writer.write("\n");
            writer.write("This file was created using Java.");

            System.out.println("Data written to the file successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred while writing to the file.");

        } finally {

            if (writer != null) {

                try {

                    writer.close();

                } catch (IOException e) {

                    System.out.println("An error occurred while closing the file.");
                }
            }
        }
    }
}