/*
 * ArrayBasics.java
 * CIS 1130 Week 5 Code Guide: Chapter 7, creating and using arrays
 *
 * An ARRAY stores many values of the SAME type under one name.
 * Each value sits in a numbered slot called an INDEX, starting at 0.
 *
 *   int[] scores = {90, 75, 88};
 *   index:           0   1   2
 *
 * An array's size is fixed when it's created. scores.length is 3.
 *
 * Compile and run:
 *   javac ArrayBasics.java
 *   java ArrayBasics
 */
public class ArrayBasics {
    public static void main(String[] args) {

        // ---------- Two ways to create an array ----------
        // 1. With values you already know (an "array initializer"):
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};

        // 2. With a size, then fill it in later. Java fills new arrays with
        //    default values: 0 for numbers, false for booleans, null for Strings.
        double[] rainfall = new double[5];
        rainfall[0] = 0.25;
        rainfall[3] = 1.10;

        // ---------- Reading and changing elements ----------
        System.out.println("First day: " + days[0]);                       // Mon
        System.out.println("Last day: " + days[days.length - 1]);          // Fri
        System.out.println("Rain on Tue (never set): " + rainfall[1]);     // 0.0
        days[2] = "WED";                                                    // change one element
        System.out.println("Changed: " + days[2]);

        // ---------- Looping through an array with an index ----------
        // Use i < array.length, never <=. The last index is length - 1.
        for (int i = 0; i < days.length; i++) {
            System.out.printf("%s: %.2f in%n", days[i], rainfall[i]);
        }

        // ---------- The enhanced for loop (for-each) ----------
        // Reads each element in order. Use it when you don't need the index
        // and don't need to change the array.
        double total = 0;
        for (double inches : rainfall) {
            total += inches;
        }
        System.out.printf("Total rainfall: %.2f in%n", total);

        // ---------- A common crash ----------
        // System.out.println(days[5]);
        // ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5

        // ---------- Arrays are REFERENCES ----------
        // Assigning one array variable to another does NOT copy the array.
        // Both names point to the same array.
        int[] original = {1, 2, 3};
        int[] sameArray = original;
        sameArray[0] = 99;
        System.out.println("original[0] is now " + original[0]);           // 99!

        // To make a real copy, create a new array and copy each element.
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        copy[1] = -5;
        System.out.println("original[1] is still " + original[1]);         // 2
    }
}
