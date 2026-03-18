package OOPS.Polymorphism.Types;

public class CompileTime {
    // method to add two integers
    public int addition(int x, int y) {
        return x + y;
    }

    // method to add three integers
    public int addition(int x, int y, int z) {
        return x + y + z;
    }

    // methods to add two doubles
    public double addition(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        // creating  object to main method
        CompileTime number = new CompileTime();

        // calling the overloaded methods
        int res1 = number.addition(200, 200);
        System.out.println("Addition of two integers : " + res1);

        int res2 = number.addition(100,200,200);
        System.out.println("Addition of three integres : " +  res2);

        double res3 = number.addition(500.12, 400.12);
        System.out.println("Addition of two doubles : " + res3);
    }
}
