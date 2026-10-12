package W05;

// Try it answer for video #26 (try it yourself first): use Euclid's algorithm to find the GCD of 252 and 105,
// and count the steps.
public class W05E25 {
    public static void main(String[] args) {
        int a = 252, b = 105, steps = 0;
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
            steps++;
        }
        System.out.println("GCD = " + a + " after " + steps + " steps");
    }
}
