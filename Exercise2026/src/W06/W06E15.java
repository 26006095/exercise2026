package W06;

import java.util.Arrays;

// Selection sort: on each pass, find the smallest value in the unsorted part and swap it to the front of that part.
// The array is printed after every pass.
public class W06E15 {
    public static void main(String[] args) {
        double[] times = {12.8, 11.9, 13.4, 12.1, 11.6};
        System.out.println("Start:  " + Arrays.toString(times));
        for (int pass = 0; pass < times.length - 1; pass++) {
            int minIndex = pass;
            for (int i = pass + 1; i < times.length; i++) {
                if (times[i] < times[minIndex]) {
                    minIndex = i;
                }
            }
            double temp = times[pass];
            times[pass] = times[minIndex];
            times[minIndex] = temp;
            System.out.println("Pass " + (pass + 1) + ": " + Arrays.toString(times));
        }
    }
}
