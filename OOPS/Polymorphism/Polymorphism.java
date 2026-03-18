package OOPS.Polymorphism;

interface Vegetarian{}
class Animal{}

public class Polymorphism extends Animal implements Vegetarian{
    public static void main(String[] args) {
        Polymorphism deer = new Polymorphism();
        Animal a = deer;
        Vegetarian v = deer;
        Object o = deer;
        System.out.println(deer instanceof Polymorphism);
        System.out.println(a instanceof Polymorphism);
		System.out.println(v instanceof Polymorphism);
		System.out.println(o instanceof Polymorphism);
    }
}
