package OOPS.Inheritance.Types;

public class HierarchicalLevel {
    public void printOne() {
        System.out.println("printOne() Method of Class One");
    }
}

class Two extends HierarchicalLevel {
    public void printTwo() {
        System.out.println("Two() Method of Class Two");
    }
}

class Three extends HierarchicalLevel {
    public void printThree() {
        System.out.println("printThree() Method of Class Three");
    }
}

class Main {
    public static void main(String args[]) {
        Two obj1 = new Two();
        Three obj2 = new Three();

        // All classes can access the method of class One
        obj1.printOne();
        obj2.printOne();
    }
}