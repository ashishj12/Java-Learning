package OOPS.Encapsulation.Classes;

public class ReadOnly {
    private String name = "Java";
    private int age = 25;

    // getter method
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

class Main {
    public static void main(String[] args) {
        ReadOnly person = new ReadOnly();
        System.out.println("Name of the person is : " + person.getName());
        System.out.println("Age of the person is : " + person.getAge());
    }
}
