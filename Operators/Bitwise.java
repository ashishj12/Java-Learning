package Operators;

public class Bitwise {
    public static void main(String[] args) {
        int A = 2;
        int B = 2;

        System.out.println("A & B: " + (A & B));
        System.out.println("A | B: " + (A | B));
        System.out.println("A ^ B: " + (A ^ B));
        System.out.println("~A: " + (~A));
        System.out.println("A << 2: " + (A << 2));
        System.out.println("A >> 2: " + (A >> 2));
        System.out.println("A >>> 2: " + (A >>> 2));
    }
}
