/*
 * SearchExamples.java
 * CIS 1130 Week 5 Code Guide: Chapter 7, linear search and binary search
 *
 * LINEAR SEARCH checks every element, one at a time, from the start.
 *   - Works on ANY array, sorted or not.
 *   - Simple, but slow for huge arrays.
 *
 * BINARY SEARCH repeatedly checks the MIDDLE of the remaining range and
 * throws away the half that can't contain the target.
 *   - The array MUST be sorted first.
 *   - Very fast: 1,000,000 elements takes at most about 20 checks.
 *
 * Both return the INDEX where the target was found, or -1 if it isn't there.
 *
 * Compile and run:
 *   javac SearchExamples.java
 *   java SearchExamples
 */
public class SearchExamples {

    public static void main(String[] args) {
        int[] ids = {4021, 1187, 3350, 2299, 5104};
        System.out.println("Linear search for 2299: index " + linearSearch(ids, 2299));  // 3
        System.out.println("Linear search for 9999: index " + linearSearch(ids, 9999));  // -1

        int[] sorted = {3, 8, 15, 21, 34, 42, 57, 66, 80};
        System.out.println("Binary search for 42: index " + binarySearch(sorted, 42));   // 5
        System.out.println("Binary search for 10: index " + binarySearch(sorted, 10));   // -1

        // Always check for -1 before using the result as an index!
        int spot = linearSearch(ids, 1187);
        if (spot == -1) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found 1187 at index " + spot);
        }
    }

    public static int linearSearch(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;              // found it: stop and return the index
            }
        }
        return -1;                     // checked everything: not there
    }

    public static int binarySearch(int[] sorted, int target) {
        int low = 0;
        int high = sorted.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.println("  checking index " + mid + " (value " + sorted[mid] + ")");
            if (sorted[mid] == target) {
                return mid;
            } else if (sorted[mid] < target) {
                low = mid + 1;         // target is in the upper half
            } else {
                high = mid - 1;        // target is in the lower half
            }
        }
        return -1;
    }
}
