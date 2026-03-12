import java.util.Arrays;
import java.util.List;

public class LoopControl {
    public static void main(String args[]) {
        int[] numbers = { 10, 20, 30, 40, 50 };

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("value of item : " + numbers[index]);
            System.out.print("\n");
        }
        List<String> names = Arrays.asList("James", "Larry", "Tom", "Lacy");
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }
        int[] numbers1 = { 10, 20, 30, 40, 50 };
        int index = 0;

        while (index < 5) {
            System.out.print("value of item : " + numbers1[index]);
            index++;
            System.out.print("\n");
        }
        int x = 10;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (true);
    }
}
