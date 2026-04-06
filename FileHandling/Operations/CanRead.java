package FileHandling.Operations;

import java.io.*;

public class CanRead {

    public static void main(String[] args) {
        try {
            File obj = new File("FileHandling/example.txt");
            if (obj.createNewFile()) {
                System.out.println("File created :" + obj.getName());
            } else {
                System.out.println("File already exists...");
            }
            // check if file is readable or not
            if (obj.canRead()) {
                System.out.println("The file is readable");
            } else {
                System.out.println("File is not readable");
            }
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }

}
