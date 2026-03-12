public class Unicode {
    public static void main(String[] args) {
        // using unicode escape sequence
        // char unicodeChar = '\u0041'; // point for 'A'
        // System.out.println("stored unicode character : " + unicodeChar);

        // assigning unicode values to varibles
        char letterA = '\u0041';
        char letterSigma = '\u03A3';
        char letterZ = 'Z';
        // Printing the stored Unicode characters
        System.out.println("Stored Unicode Characters using Escape Sequences:");
        System.out.println("Letter A: " + letterA);
        System.out.println("Greek Capital Letter Sigma: " + letterSigma);
        System.out.println("\nStored Unicode Characters Directly:");
        System.out.println("Letter Z: " + letterZ);
    }
}
