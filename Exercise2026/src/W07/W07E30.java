package W07;

import java.util.Arrays;

// Try it answer for video #36 (try it yourself first): predict, then run.
// update sets its int parameter and the first array element to 0. Which change does main see?
public class W07E30 {
    static void update(int n, int[] a) {
        n = 0;
        a[0] = 0;
    }

    public static void main(String[] args) {
        int n = 7;
        int[] a = {7, 8};
        update(n, a);
        System.out.println("n = " + n);
        System.out.println("a = " + Arrays.toString(a));
    }
}
