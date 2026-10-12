package W05;

// Try it answer for video #24 (try it yourself first): a number staircase with 4 rows.
// Row i prints the number i, i times: 1, 22, 333, 4444.
public class W05E23 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
