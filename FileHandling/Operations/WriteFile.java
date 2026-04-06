package FileHandling.Operations;

import java.io.*;

public class WriteFile {

    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("FileHandling/example.txt");
            // writing file
            writer.write("File Handling in java");
            writer.close();
            System.out.println("File Written Successfully");
        } catch (IOException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }

}
