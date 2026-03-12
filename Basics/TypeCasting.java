// typecasting or typeconversion referes to convert one datatype into another datatype (byte>short>char>int>long>float>double)

// 1. windening type casting (implicit type casting) -> smaller type converted into larger type.

// 2. Narrowing type casting (explicit type casting) ->larger type converted into smaller type.

public class TypeCasting {

    // e.g. of basic addiation of two number with typecasting
    public static void main(String[] args) {
        int num1 = 20;
        double num2 = 2.5;
        double sum = num1 + num2;
        System.out.println("the sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
