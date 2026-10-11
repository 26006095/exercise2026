package W05;

// Number triangles: row i prints 1 to i. Then the upside-down triangle counts the rows down.
public class W05E04 {
    public static void main(String[] args) {
        int rows = 4;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = rows; i >= 1; i--) {      // upside down: the row length goes down
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
