package OOPS.Polymorphism.Types;

public class RunTime {
    public void displayInfo() {
        System.out.println("Some vehicles are there.");
    }
}

class Car extends RunTime {
    // method overriding
    @Override
    public void displayInfo() {
        System.out.println("I hava a Car");
    }
}

class Bike extends RunTime {
    @Override
    public void displayInfo() {
        System.out.println("I have a Bike");
    }
}

class Main {
    public static void main(String[] args) {
        RunTime v1 = new Car();
        RunTime v2 = new Bike();

        v1.displayInfo();
        v2.displayInfo();
    }
}