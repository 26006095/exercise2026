package W06;

// A ragged array: rows of different length. Each row is its own array, so use orders[t].length, not one fixed number.
// Orders (RM) at three cafe tables: table 1 has 3 orders, table 2 has 1, table 3 has 4.
public class W06E21 {
    public static void main(String[] args) {
        int[][] orders = {
            {12, 8, 15},
            {20},
            {6, 9, 11, 7}
        };
        for (int t = 0; t < orders.length; t++) {
            int total = 0;
            System.out.print("Table " + (t + 1) + " (orders: " + orders[t].length + "):");
            for (int k = 0; k < orders[t].length; k++) {
                System.out.print(" " + orders[t][k]);
                total += orders[t][k];
            }
            System.out.println("  total RM" + total);
        }

        int[][] later = new int[2][];     // rows created later, each with its own length
        later[0] = new int[2];
        later[1] = new int[5];
        System.out.println("Row lengths: " + later[0].length + " and " + later[1].length);
    }
}
