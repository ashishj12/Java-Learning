package OOPSIntro;

public class ClassIntro {

    // declaring students attributes
    String name;
    int rollNo;
    String section;

    // initialize students attributes
    ClassIntro(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // printing details
    public void printDetails() {
        System.out.println("Student Details");
        System.out.println(this.name + ", " + ", " + this.rollNo + ", " + section);
    }

    public static void main(String[] args) {
        // creating student objects
        ClassIntro student1 = new ClassIntro("Test1", 1, "First Section");
        ClassIntro student2 = new ClassIntro("Test2", 2, "Second Section");
        ClassIntro student3 = new ClassIntro("Test3", 3, "Third Section");

        // print student details
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
    }
}
