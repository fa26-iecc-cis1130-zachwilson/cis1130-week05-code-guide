/*
 * TwoDArrayBasics.java
 * CIS 1130 Week 5 Code Guide: Chapter 8, two-dimensional arrays
 *
 * A 2D array is a table: rows and columns. Think of a spreadsheet.
 *   grid[row][column]
 *
 * Under the hood, a 2D array is an array of rows, and each row is an array.
 *   grid.length      = number of rows
 *   grid[r].length   = number of columns in row r
 *
 * Compile and run:
 *   javac TwoDArrayBasics.java
 *   java TwoDArrayBasics
 */
public class TwoDArrayBasics {
    public static void main(String[] args) {

        // ---------- Creating a 2D array with values ----------
        // 3 rows (weeks) by 4 columns (Mon to Thu): hours studied
        double[][] hours = {
            {1.5, 2.0, 0.5, 1.0},   // row 0: week 1
            {2.0, 1.0, 1.5, 2.5},   // row 1: week 2
            {0.0, 3.0, 2.0, 1.0}    // row 2: week 3
        };

        System.out.println("Rows: " + hours.length);            // 3
        System.out.println("Columns: " + hours[0].length);      // 4
        System.out.println("Week 2, Wed: " + hours[1][2]);      // 1.5

        hours[2][0] = 0.75;                                      // change one cell

        // ---------- Creating an empty 2D array ----------
        int[][] seats = new int[2][5];      // 2 rows, 5 columns, all 0
        seats[1][3] = 1;

        // ---------- Printing a table with nested loops ----------
        // Outer loop: rows. Inner loop: columns in that row.
        String[] dayNames = {"Mon", "Tue", "Wed", "Thu"};
        System.out.printf("%-8s", "");
        for (String d : dayNames) {
            System.out.printf("%6s", d);
        }
        System.out.println();
        for (int row = 0; row < hours.length; row++) {
            System.out.printf("%-8s", "Week " + (row + 1));
            for (int col = 0; col < hours[row].length; col++) {
                System.out.printf("%6.2f", hours[row][col]);
            }
            System.out.println();
        }

        // ---------- The seats array ----------
        System.out.println("Seats (1 = taken):");
        for (int row = 0; row < seats.length; row++) {
            for (int col = 0; col < seats[row].length; col++) {
                System.out.print(seats[row][col] + " ");
            }
            System.out.println();
        }
    }
}
