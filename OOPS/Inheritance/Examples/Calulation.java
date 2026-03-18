package OOPS.Inheritance.Examples;

public class Calulation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of given number is : " + z);
    }

    public void subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between two number is : " + z);
    }
}

class My_Calculation extends Calulation {
    public void multiplicaton(int x, int y) {
        z = x * y;
        System.out.println("The product of given numbers : " + z);
    }

    public static void main(String[] args) {
        int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.subtraction(a, b);
        demo.multiplicaton(a, b);
    }
}
