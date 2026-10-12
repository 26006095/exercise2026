package W05;

// Try it answer for video #28 (try it yourself first): with one loop and String.repeat (Java 11),
// print a right-aligned triangle of 5 rows: row i has (5 - i) spaces, then i stars.
public class W05E27 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            System.out.println(" ".repeat(rows - i) + "*".repeat(i));
        }
    }
}
