// java is staticlly type language which means that data type of every varible known at compile time.

// 1. Primitive DataType (Store simple values in memory)

// 2. Non-Primitive DataType (Store memory reference of objects)

public class DataType {
    public static void main(String[] args) {
        // boolean datatype
        boolean isValidAge = true;
        System.out.println("Is boy valid?" + isValidAge);

        // byte datatype -> 8 bit signed integer
        byte age = 25;
        System.out.println("Age : " + age);

        // short datatype -> when memory is limited and values are moderate
        short students = 1000;
        short temp1 = -200;

        System.out.println("Students : " + students);
        System.out.println("Temp : " + temp1);

        // string datatype -> string buider datatype use for heavy string 
        String name = "Java";
        String message = "Learn";

        System.out.println("name" + name);
        System.out.println("message" + message);

    }
}
