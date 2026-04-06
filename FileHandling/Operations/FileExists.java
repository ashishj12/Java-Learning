package FileHandling.Operations;

import java.io.*;

public class FileExists {
    public static void main(String[] args) {
        File obj = new File("FileHandling/example.txt");
        if (obj.exists()) {
            System.out.println("File already exists : " + obj.getName());
        } else {
            System.out.println("File is not exists");
        }
    }
}
