public class LocalVariable {
    public void Age() {
        int age = 20;
        // int age1; // try to understand the topic of variable local scope without initalization
        age = age + 1;
        // age1 = age1 + 2;
        System.out.println("Age is : " + age);
        // System.out.println("Age is : " + age1);
    }

    public static void main(String args[]) {
        LocalVariable lv = new LocalVariable();
        lv.Age();
    }
}
