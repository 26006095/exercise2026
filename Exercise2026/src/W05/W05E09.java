package W05;

// continue skips the rest of this pass and goes on with the next one. Print 1 to 20 without the multiples of 3.
public class W05E09 {
    public static void main(String[] args) {
        for (int n = 1; n <= 20; n++) {
            if (n % 3 == 0) {
                continue;
            }
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
