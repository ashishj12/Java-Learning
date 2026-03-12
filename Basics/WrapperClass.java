
// wrapper classes allow primitive data types to be represented as objects. This enables primitives to be used in object-oriented features such as collections, generics, and APIs that require objects.

// Each wrapper class encapsulates a corresponding primitive value inside an object (e.g., Integer for int, Double for double).

// Java provides wrapper classes for all eight primitive data types to support object-based operations.

// 1. Autoboxing -> automatic converison of primtive datatype to their corresponding wrapper class.

public class WrapperClass {
    public static void main(String[] args) {

        int a = 1;
        Integer b = a;
        System.out.println("Primtive b is : " + b);
    }
}
