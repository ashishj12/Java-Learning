package OOPS.Overriding;

public class Overriding {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Overriding {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

class TestDog {
    public static void main(String[] args) {
        Overriding a = new Overriding();
        Overriding b = new Dog();

        a.move();
        b.move();
    }
}