// it a technique of hiding internal details and showing functionalities. the abstract class and interfaces are used to achieve abstraction in java.

package OOPSIntro.Examples;

abstract class Abstraction {
    public void startEngine() {
        System.out.println("Engine start");
    }
}

public class Car extends Abstraction {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public void printDetails() {
        System.out.println("Car color  : " + this.color);
    }

    public static void main(String[] args) {
        Car car = new Car("White");
        car.printDetails();
        car.startEngine();
    }
}
