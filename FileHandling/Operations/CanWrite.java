package FileHandling.Operations;

import java.io.*;

public class CanWrite {

    public static void main(String[] args) {
        try {
            // Create a new file
            File obj = new File("FileHandling/example.txt");

            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Check if the file is writable
            if (obj.canWrite()) {
                System.out.println("The file is writable."); // One-line explanation
            } else {
                System.out.println("The file is not writable.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
