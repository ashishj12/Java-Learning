package Packages.BuiltIn;

import java.io.*; // include all the I/O Opearations
import java.util.*; // include all the utility classes for data structure, collections and more.
import java.net.*; // include network classes like websocket and all.

public class BuiltInPackages {
    public static void main(String[] args) {
        // java.util package
        ArrayList<String> list = new ArrayList<>();// from utils package
        list.add("Learn");
        list.add("Java");
        System.out.println("ArrayList : " + list);

        HashMap<String, Integer> map = new HashMap<>(); // from utils package
        map.put("Age", 21);
        System.out.println("HashMap : " + map);

        // java.io package
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // for java.net package
        try {
            URL url = new URL("https://github.com/ashishj12");
            System.out.println("URL : " + url);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL : " + e.getMessage());
        }
    }
}
