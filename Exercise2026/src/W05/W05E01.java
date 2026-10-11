package W05;

// Nested loops: when nothing exits the inner loop early, it runs completely for every pass of the outer loop.
// 3 rows x 4 columns, so the inner body runs 3 x 4 = 12 times.
public class W05E01 {
    public static void main(String[] args) {
        int passes = 0;
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("# ");
                passes++;
            }
            System.out.println();      // the inner loop has finished: start the next row
        }
        System.out.println("Inner body ran " + passes + " times");
    }
}
