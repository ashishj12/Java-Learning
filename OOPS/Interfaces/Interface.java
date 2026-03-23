// Interface declared
public interface Interface {
    final int a = 10;

    void display();
}

class TestClass implements Interface {
    public void display() {
        System.out.println("Java Interface Test");
    }
}

class Main {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        t.display();
        System.out.println(t.a);
    }
}