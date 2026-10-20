package W07;

// An array as a parameter: one method works for an array of any length.
public class W07E13 {
    static int total(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    // Precondition: a has at least one element (an empty array would divide by zero).
    static double average(int[] a) {
        return (double) total(a) / a.length;
    }

    public static void main(String[] args) {
        int[] steps = {8200, 6400, 10300, 7500, 9100, 12000, 5600};
        int[] weekend = {12000, 5600};
        System.out.println("Week total:    " + total(steps));
        System.out.printf("Week average:  %.1f%n", average(steps));
        System.out.println("Weekend total: " + total(weekend));
    }
}
