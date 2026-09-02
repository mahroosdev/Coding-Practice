import java.io.File;

public class CreateFolder {

    public static void main(String[] args) {

        File folder = new File("FileHandlingPractice");

        if (folder.mkdir()) {

            System.out.println("Folder created successfully.");

        } else {

            System.out.println("Folder already exists or could not be created.");
        }
    }
}