package OOPS.Bindings;

public class Dynamic {
    public void move() {
        System.out.println("Animals can move");
    }
}

class Dog extends Dynamic {
    public void move() {
        System.out.println("Dogs can walk and run");
    }
}

class Main {
    public static void main(String[] args) {
        Dynamic a = new Dynamic();
        Dynamic b = new Dynamic();

        a.move();
        b.move();
    }
}