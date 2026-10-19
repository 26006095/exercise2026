package W06;

// Row and column totals of a table: rainfall (mm) for 3 towns (rows) over 4 weeks (columns).
// Row total: loop over the columns of one row. Column total: loop over the rows of one column.
public class W06E20 {
    public static void main(String[] args) {
        String[] towns = {"Ipoh", "Kuantan", "Kuching"};
        int[][] rain = {
            {42, 18, 65, 30},
            {80, 95, 60, 72},
            {120, 88, 101, 93}
        };
        System.out.println("Town       W1   W2   W3   W4  Total");
        for (int r = 0; r < rain.length; r++) {
            int rowTotal = 0;
            System.out.printf("%-8s", towns[r]);
            for (int c = 0; c < rain[r].length; c++) {
                System.out.printf("%5d", rain[r][c]);
                rowTotal += rain[r][c];
            }
            System.out.printf("%7d%n", rowTotal);
        }
        System.out.printf("%-8s", "Total");
        for (int c = 0; c < rain[0].length; c++) {
            int colTotal = 0;
            for (int r = 0; r < rain.length; r++) {
                colTotal += rain[r][c];
            }
            System.out.printf("%5d", colTotal);
        }
        System.out.println();
    }
}
