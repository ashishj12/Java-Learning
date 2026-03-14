package Strings;

public class BasicString {
    public static void main(String[] args) {
        String s1 = new String(); // create an empty string
        System.out.println("Empty String : " + s1);

        char arr[] = { 'a', 'b', 'c', 'd' };
        String s2 = new String(arr); //string from an array
        System.out.println("contents of array string : " + s2);
    }
}
