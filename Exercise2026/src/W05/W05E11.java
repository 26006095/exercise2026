package W05;

// In nested loops, a plain break leaves only the inner loop: the outer loop keeps going.
// A labelled break (break search;) leaves both loops. Find the first pair a < b with a x b = 36.
public class W05E11 {
    public static void main(String[] args) {
        System.out.println("Plain break:");
        for (int a = 1; a <= 20; a++) {
            for (int b = a + 1; b <= 20; b++) {
                if (a * b == 36) {
                    System.out.println("  found " + a + " x " + b);
                    break;             // leaves the b loop only
                }
            }
        }

        System.out.println("Labelled break:");
        search:
        for (int a = 1; a <= 20; a++) {
            for (int b = a + 1; b <= 20; b++) {
                if (a * b == 36) {
                    System.out.println("  found " + a + " x " + b);
                    break search;      // leaves both loops
                }
            }
        }
    }
}
