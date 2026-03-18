package OOPS.Encapsulation.Classes;

public class SetOnly {
    private String name;
    private int age;

    // setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        SetOnly person = new SetOnly();
        person.setAge(21);
        person.setName("Java");
    }
}