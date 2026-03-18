package OOPS.Overloading;

public class Overloading {
    public int multiply(int a, int b) {
        int prod = a * b;
        return prod;
    }

    public int multiply(int a, int b, int c) {
        int prod = a * b * c;
        return prod;
    }
}

class Main {
    public static void main(String[] args) {
        Overloading ob = new Overloading();

        int prod1 = ob.multiply(1, 2);
        System.out.println("Product of the two integer value : " + prod1);
        int prod2 = ob.multiply(1, 3, 2);
        System.out.println("product of the three integer value  : " + prod2);
    }
}
