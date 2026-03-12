// to take input from user in java, the scanner class is used. the scanner class is built in class in java.util.package.

// the package provide many built in methods to take different types of user input.

import java.util.*;

// an basic e.g. of addition of two numbers.
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
    }

}
