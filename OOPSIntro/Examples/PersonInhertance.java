// in this process we can reuse the functionalities of existing classess to new classes.
// Base (parent) class & Derived (child class).
//  when a class is inherited from another (base) class,it(derived) class obtain all the properties and behavior of base class.

// example of inheritance
package OOPSIntro.Examples;

public class PersonInhertance {
    String name;

    PersonInhertance(String name) {
        this.name = name;
    }
}

// create an student class that inhertance base class
class Student extends PersonInhertance {

    // defining attributes;
    int rollNo;
    String section;

    Student(String name, int rollNo, String section) {
        super(name);
        this.rollNo = rollNo;
        this.section = section;
    }

    // print details
    public void printDetails() {
        System.out.println("Student details : ");
        System.out.println(this.name + ", " + this.rollNo + ", " + section);
    }

    public static void main(String[] args) {
        // create student objects
        Student student1 = new Student("First", 1, "I A");
        Student student2 = new Student("Second", 2, "II B");
        Student student3 = new Student("Third", 3, "III C");

        // print student details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
    }
}
