package FileHandling.Operations;

import java.io.*;

public class GetPath {
    public static void main(String[] args) {
        File obj = new File("FileHandling/example.txt");
        System.out.println("Path : " + obj.getAbsolutePath());
    }
}
