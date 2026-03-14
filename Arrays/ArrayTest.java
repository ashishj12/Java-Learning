package Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        // primitive array
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        System.out.println("primitive array ->");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        // non primitive array
        String[] names = { "Array", "In", "Java" };
        System.out.println("Non primitive arrays");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }

    }
}
