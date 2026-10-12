package W05;

// Try it answer for video #25 (try it yourself first): count from 1 to 30, skip every multiple of 4,
// and stop the loop as soon as the number is greater than 25.
public class W05E24 {
    public static void main(String[] args) {
        for (int n = 1; n <= 30; n++) {
            if (n % 4 == 0) {
                continue;              // skip 4, 8, 12, ...
            }
            if (n > 25) {
                break;                 // stop the whole loop
            }
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
