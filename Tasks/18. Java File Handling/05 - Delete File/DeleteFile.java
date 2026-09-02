import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {

        File file = new File(
                "FileHandlingPractice/sample.txt"
        );

        if (file.delete()) {

            System.out.println("File deleted successfully.");

        } else {

            System.out.println("File could not be deleted or does not exist.");
        }
    }
}