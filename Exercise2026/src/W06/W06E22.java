package W06;

import java.util.Arrays;

// Three array mistakes. Mistake 1 stops the program, so its line is a Try it: remove the first //, run, read the message, then put it back.
// Mistakes 2 and 3 run with no error message: each prints the wrong result next to the right one.
public class W06E22 {
    public static void main(String[] args) {
        // 1. Declared but never created: the variable holds null, so there are no elements to use.
        int[] totals = null;
        // totals[0] = 5;   // Try it: NullPointerException (Cannot store to int array because "totals" is null)
        totals = new int[3];
        totals[0] = 5;
        System.out.println("1. totals: " + Arrays.toString(totals));

        // 2. Alias surprise: backup = stock does not copy, so the "backup" changes too. A real copy keeps the old values.
        int[] stock = {10, 20, 30};
        int[] backup = stock;                                    // wrong: a second name for the same array
        int[] realBackup = Arrays.copyOf(stock, stock.length);   // right: a new array
        stock[0] = 0;
        System.out.println("2. stock:      " + Arrays.toString(stock));
        System.out.println("   backup:     " + Arrays.toString(backup) + "  (changed with stock)");
        System.out.println("   realBackup: " + Arrays.toString(realBackup) + "  (kept)");

        // 3. Wrong bound in a 2D loop: grid has 2 rows and 3 columns. c < grid.length stops at 2 columns, with no error.
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        int wrong = 0, right = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid.length; c++) {        // wrong: grid.length is the number of rows
                wrong += grid[r][c];
            }
            for (int c = 0; c < grid[r].length; c++) {     // right: the length of this row
                right += grid[r][c];
            }
        }
        System.out.println("3. sum with c < grid.length: " + wrong + ", with c < grid[r].length: " + right);
    }
}
