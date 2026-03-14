package Arrays;

public class ProcessArray {
    public static void main(String[] args) {

        // print all elements in array
        double my_list[] = { 1.5, 1.6, 1.7, 1.8, 1.9 };
        for (int i = 0; i < my_list.length; i++) {
            System.out.println(my_list[i] + " ");
        }

        // summing all the elements
        double total = 0;
        for (int i = 0; i < my_list.length; i++) {
            total += my_list[i];
        }
        System.out.println("sum of all elements  : " + total);

        // finding the larget element
        double max = my_list[0];
        for (int i = 0; i < my_list.length; i++) {
            if (my_list[i] > max)
                max = my_list[i];
        }
        System.out.println("Max is : " + max);
    }
}
