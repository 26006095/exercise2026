package W05;

// Trace a nested loop: here the inner loop depends on the outer one (j <= i),
// so row 1 runs once, row 2 twice, ... Predict the total before you run it.
public class W05E06 {
    public static void main(String[] args) {
        int passes = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                passes++;
            }
            System.out.println("after row " + i + ", passes so far: " + passes);
        }
        System.out.println("Total: " + passes);
    }
}
