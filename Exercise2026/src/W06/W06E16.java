package W06;

import java.util.Arrays;

// Bubble sort: compare neighbours and swap them when they are out of order; the largest moves to the end each pass.
// Each pass can check one place fewer. If a pass makes no swap, the array is sorted, so stop early.
public class W06E16 {
    public static void main(String[] args) {
        double[] weights = {2.4, 1.1, 3.6, 0.9, 1.8, 4.2};
        System.out.println("Start:  " + Arrays.toString(weights));
        int passes = 0;
        boolean swapped = true;
        for (int end = weights.length - 1; end > 0 && swapped; end--) {
            swapped = false;
            for (int i = 0; i < end; i++) {
                if (weights[i] > weights[i + 1]) {
                    double temp = weights[i];
                    weights[i] = weights[i + 1];
                    weights[i + 1] = temp;
                    swapped = true;
                }
            }
            passes++;
            System.out.println("Pass " + passes + ": " + Arrays.toString(weights));
        }
        System.out.println("Passes used: " + passes + " of " + (weights.length - 1));
    }
}
