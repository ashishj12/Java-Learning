package ArrayList;

import java.util.*;

public class BasicOpereation {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<>();
        skills.add("Learn");
        skills.add("Java");
        skills.add("Backend");

        System.out.println("Skills : " + skills);

        skills.remove("Learn");
        System.out.println("After removal" + skills);
        System.out.println("First skills : " + skills.get(0));
    }
}
