package FileHandling.Operations;

import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File obj = new File("example.txt");
            // creating a file
            if (obj.createNewFile()) {
                System.out.println("New File Created : " + obj.getName());
            } else {
                System.out.println("File is already exists...");
            }
        } catch (IOException e) {
            System.out.println("An error has been occurred");
            e.printStackTrace();
        }
    }
}
