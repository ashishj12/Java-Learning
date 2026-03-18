package OOPS.Bindings;

public class Static {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Main {
    public static void main(String args[]) {
        System.out.println(Static.add(20, 40));
        System.out.println(Static.add(40, 50, 60));
    }
}