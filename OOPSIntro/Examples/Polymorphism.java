// create multiple forms with same name of a single entity. 
// we use method overloading and overriding.
// method overloading when we have multiple methods with same name but different parameters.
// method overriding by using inheritance we can have multiplw methods with the same in parent and child classes.

package OOPSIntro.Examples;

public class Polymorphism {

    // student example
    String name;
    int rollNo;
    String section;

    Polymorphism(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    public void printDetails() {
        System.out.print("Student Details: ");
        System.out.println(this.name + ", " + this.rollNo + ", " + section);
    }

    // print details without section if required
    public void printDetails(boolean hideSection) {
        System.out.print("Student Details: ");
        System.out.println(this.name + ", " + this.rollNo + ", " + (hideSection ? "" : section));
    }

    public static void main(String[] args) {
        Polymorphism student1 = new Polymorphism("Student1", 1, "A");
        Polymorphism student2 = new Polymorphism("Student2", 2, "B");
        Polymorphism student3 = new Polymorphism("Student3", 3, "C");

        // print student details
        student1.printDetails();
        student2.printDetails(true);
        student3.printDetails(false);
    }
}
