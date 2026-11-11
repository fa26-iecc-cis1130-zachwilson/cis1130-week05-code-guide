/*
 * SelectionSortExample.java
 * CIS 1130 Week 5 Code Guide: Chapter 7, selection sort
 *
 * SELECTION SORT, smallest to largest:
 *   For each position i, starting at 0:
 *     1. Find the smallest value from position i to the end.
 *     2. Swap it into position i.
 *   After each pass, one more element is in its final place.
 *
 * Java also has a built-in sort, java.util.Arrays.sort(array), which you
 * can use in real programs. Writing it yourself teaches how sorting works.
 *
 * Compile and run:
 *   javac SelectionSortExample.java
 *   java SelectionSortExample
 */
public class SelectionSortExample {

    public static void main(String[] args) {
        double[] prices = {4.50, 1.25, 9.99, 3.00, 2.75};

        System.out.print("Before: ");
        print(prices);

        selectionSort(prices);       // sorts the array itself (arrays are references)

        System.out.print("After:  ");
        print(prices);
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // 1. Find the index of the smallest value in list[i..end]
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            // 2. Swap it into position i (a swap needs a temporary variable)
            double temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;

            System.out.print("  after pass " + (i + 1) + ": ");
            print(list);
        }
    }

    public static void print(double[] list) {
        for (double p : list) {
            System.out.printf("%.2f ", p);
        }
        System.out.println();
    }

    /*
     * Want largest to smallest instead? Look for the LARGEST value in step 1
     * by changing  list[j] < list[minIndex]  to  list[j] > list[minIndex].
     *
     * Sorting Strings? Compare with compareTo instead of <:
     *     if (names[j].compareTo(names[minIndex]) < 0)
     */
}
