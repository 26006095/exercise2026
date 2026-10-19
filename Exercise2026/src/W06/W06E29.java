package W06;

import java.util.Arrays;

// Try it answer for video #32 (try it yourself first): one pass of selection sort by hand.
// Find the smallest value and its index, then swap it into index 0 and print the array.
public class W06E29 {
    public static void main(String[] args) {
        int[] a = {18, 7, 25, 3, 12};
        int minIndex = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println("Smallest: " + a[minIndex] + " at index " + minIndex);
        int temp = a[0];
        a[0] = a[minIndex];
        a[minIndex] = temp;
        System.out.println("After one pass: " + Arrays.toString(a));
    }
}
