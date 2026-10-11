package W05;

// Plan a pattern by rows: row i prints i stars. The outer loop is the row, the inner loop the stars.
public class W05E03 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
