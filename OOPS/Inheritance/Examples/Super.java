// demonstration of super keyword

package OOPS.Inheritance.Examples;

public class Super {
    int num = 20;

    // display method of superclass
    public void Display() {
        System.out.println("This is display  method of super class");
    }
}

class Sub_Class extends Super {
    int num = 10;

    // display method of subclass
    public void Display() {
        System.out.println("This is display method of subclass");
    }

    public void my_method() {
        // Instataniating subclass
        Sub_Class sub = new Sub_Class();

        // invoking method of subclass
        sub.Display();

        // invoking method of super class
        super.Display();

        // printing the value of variable num of subclass
        System.out.println("value of the variable named num in sub class:" + sub.num);

        // printing the value of variable num of superclass
        System.out.println("value of the variable named num in super class:" + super.num);
    }

    public static void main(String[] args) {
        Sub_Class obj = new Sub_Class();
        obj.my_method();
    }
}
