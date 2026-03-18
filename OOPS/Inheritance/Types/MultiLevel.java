package OOPS.Inheritance.Types;

public class MultiLevel {
    public void printOne() {
        System.out.println("printOne() method of one class");
    }
}

class Two extends MultiLevel {
    public void printTwo() {
        System.out.println("printTwo() method of Two class.");
    }
}

class Main extends Two {
    public static void main(String[] args) {
        Main obj = new Main();

        // calling the methods
        obj.printOne();
        obj.printTwo();
    }
}