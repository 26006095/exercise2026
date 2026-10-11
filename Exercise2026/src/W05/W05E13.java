package W05;

// Case study: the greatest common divisor (GCD) of 84 and 36, two ways.
// Brute force tests candidates from the smaller number down until the first common divisor; Euclid uses remainders.
// Count the passes: a better algorithm can need far fewer.
public class W05E13 {
    public static void main(String[] args) {
        int x = 84, y = 36;

        int gcd = 1, tries = 0;
        for (int d = Math.min(x, y); d >= 1; d--) {
            tries++;
            if (x % d == 0 && y % d == 0) {
                gcd = d;
                break;
            }
        }
        System.out.println("Brute force: GCD = " + gcd + " after " + tries + " tries");

        int a = x, b = y, steps = 0;
        while (b != 0) {                 // Euclid: gcd(a, b) = gcd(b, a % b)
            int r = a % b;
            a = b;
            b = r;
            steps++;
        }
        System.out.println("Euclid:      GCD = " + a + " after " + steps + " steps");
    }
}
