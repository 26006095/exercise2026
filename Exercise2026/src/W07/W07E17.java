package W07;

import java.util.Arrays;

// A 2D array as a parameter: the W06E20 rainfall table, row totals computed by a method that returns an array.
public class W07E17 {
    static int[] rowTotals(int[][] t) {
        int[] totals = new int[t.length];
        for (int r = 0; r < t.length; r++) {
            for (int c = 0; c < t[r].length; c++) {
                totals[r] += t[r][c];
            }
        }
        return totals;
    }

    public static void main(String[] args) {
        int[][] rain = {
            {42, 18, 65, 30},
            {80, 95, 60, 72},
            {120, 88, 101, 93}
        };
        System.out.println("Town totals: " + Arrays.toString(rowTotals(rain)));
    }
}
