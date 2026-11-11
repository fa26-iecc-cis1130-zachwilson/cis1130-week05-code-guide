/*
 * TwoDArrayProcessing.java
 * CIS 1130 Week 5 Code Guide: Chapter 8, processing rows and columns
 *
 * The big idea: which loop is on the OUTSIDE decides what you're totaling.
 *   - Row totals:    outer loop = rows,    inner loop = columns
 *   - Column totals: outer loop = columns, inner loop = rows
 *
 * Compile and run:
 *   javac TwoDArrayProcessing.java
 *   java TwoDArrayProcessing
 */
public class TwoDArrayProcessing {

    public static void main(String[] args) {
        String[] stores = {"Olney", "Robinson", "Fairfield"};
        String[] months = {"Sep", "Oct", "Nov"};
        int[][] sales = {
            {120, 135, 150},    // Olney
            { 98, 110, 105},    // Robinson
            {143, 120, 160}     // Fairfield
        };

        // Row totals: one total per store
        for (int r = 0; r < sales.length; r++) {
            System.out.println(stores[r] + " total: " + rowTotal(sales, r));
        }

        // Column totals: one total per month
        for (int c = 0; c < sales[0].length; c++) {
            System.out.println(months[c] + " total: " + columnTotal(sales, c));
        }

        System.out.println("Grand total: " + grandTotal(sales));

        // Where is the single largest value? Track BOTH the row and the column.
        int bestRow = 0, bestCol = 0;
        for (int r = 0; r < sales.length; r++) {
            for (int c = 0; c < sales[r].length; c++) {
                if (sales[r][c] > sales[bestRow][bestCol]) {
                    bestRow = r;
                    bestCol = c;
                }
            }
        }
        System.out.println("Best month: " + stores[bestRow] + " in " + months[bestCol]
                + " (" + sales[bestRow][bestCol] + ")");

        // A row is itself a 1D array, so you can pass it to a 1D method.
        System.out.printf("Robinson average: %.1f%n", average(sales[1]));
    }

    public static int rowTotal(int[][] grid, int row) {
        int total = 0;
        for (int c = 0; c < grid[row].length; c++) {
            total += grid[row][c];
        }
        return total;
    }

    public static int columnTotal(int[][] grid, int col) {
        int total = 0;
        for (int r = 0; r < grid.length; r++) {
            total += grid[r][col];
        }
        return total;
    }

    public static int grandTotal(int[][] grid) {
        int total = 0;
        for (int[] row : grid) {          // each row is an int[]
            for (int value : row) {
                total += value;
            }
        }
        return total;
    }

    public static double average(int[] values) {
        int sum = 0;
        for (int v : values) {
            sum += v;
        }
        return (double) sum / values.length;
    }
}
