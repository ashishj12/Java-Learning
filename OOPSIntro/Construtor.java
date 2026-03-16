// use a constructor to give intial values to the instance variables defined by the class.
// name of the constructor is same as the class.
// there will  be multiple constructor inside the class, that is called constructor overloading.

package OOPSIntro;

public class Construtor {
    Construtor() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println("main method");
    }

    Construtor obj_x = new Construtor();
}
