package FileHandling.Operations;

import java.io.*;

public class DeleteFile {
    public static void main(String[] args) {
        File obj = new File("FileHandling/example.txt");
        if (obj.delete()) {
            System.out.println("The deleted file is : " + obj.getName());
        } else {
            System.out.println("Failed in deleting in file");
        }
    }
}
