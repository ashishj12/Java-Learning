package OOPS.Inheritance.Types;

public class SingleLevel {
    public void printOne() {
        System.out.println("printOne() method of one class");
    }
}

class Main extends SingleLevel {
    public static void main(String[] args) {

        // creating object of the dervied class (Main)
        Main obj = new Main();
        // calling method
        obj.printOne();
    }
}
