package W05;

// A table is a loop inside a loop: the outer loop picks the row, the inner loop fills the columns.
public class W05E02 {
    public static void main(String[] args) {
        System.out.print("  x |");
        for (int col = 1; col <= 9; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();
        System.out.println("----+------------------------------------");
        for (int row = 1; row <= 9; row++) {
            System.out.printf("%3d |", row);
            for (int col = 1; col <= 9; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}
