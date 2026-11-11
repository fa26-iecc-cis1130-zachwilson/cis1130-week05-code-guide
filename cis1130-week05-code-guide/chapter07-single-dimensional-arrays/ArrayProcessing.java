/*
 * ArrayProcessing.java
 * CIS 1130 Week 5 Code Guide: Chapter 7, common array patterns
 *
 * Almost every array program uses a few patterns over and over:
 *   total and average, largest and smallest, counting matches,
 *   and passing arrays to (and returning them from) methods.
 *
 * Compile and run:
 *   javac ArrayProcessing.java
 *   java ArrayProcessing
 */
public class ArrayProcessing {

    public static void main(String[] args) {
        int[] steps = {6200, 8400, 10150, 4300, 9800, 12000, 7650};

        printArray(steps);
        System.out.printf("Average: %.1f steps%n", average(steps));
        System.out.println("Most steps: " + max(steps));
        System.out.println("Day with most steps (index): " + indexOfMax(steps));
        System.out.println("Days with 10,000 or more: " + countAtLeast(steps, 10000));

        // Methods can return a brand-new array.
        int[] bonus = addToEach(steps, 500);
        printArray(bonus);
    }

    // Arrays are passed to methods like any other value.
    public static void printArray(int[] values) {
        System.out.print("[");
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i]);
            if (i < values.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // TOTAL AND AVERAGE: start at 0, add each element.
    public static double average(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }

    // LARGEST: start with the FIRST element, not 0 (what if all values are negative?).
    public static int max(int[] values) {
        int biggest = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > biggest) {
                biggest = values[i];
            }
        }
        return biggest;
    }

    // Sometimes you need WHERE the largest is, not just its value.
    public static int indexOfMax(int[] values) {
        int best = 0;
        for (int i = 1; i < values.length; i++) {
            if (values[i] > values[best]) {
                best = i;
            }
        }
        return best;
    }

    // COUNTING: add 1 each time the condition is true.
    public static int countAtLeast(int[] values, int target) {
        int count = 0;
        for (int v : values) {
            if (v >= target) {
                count++;
            }
        }
        return count;
    }

    // RETURNING AN ARRAY: build a new one and return it.
    public static int[] addToEach(int[] values, int amount) {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] + amount;
        }
        return result;
    }
}
