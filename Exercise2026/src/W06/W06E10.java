package W06;

import java.util.Arrays;

// An array variable holds a reference. alias = a gives the same array a second name (an alias); it does not copy it.
// To copy, make a new array: with a loop, Arrays.copyOf or System.arraycopy.
public class W06E10 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] alias = a;
        alias[0] = 99;
        System.out.println("a after alias[0] = 99:  " + Arrays.toString(a));

        int[] copy = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        copy[1] = 50;
        System.out.println("a after copy[1] = 50:   " + Arrays.toString(a));
        System.out.println("copy:                   " + Arrays.toString(copy));

        int[] longer = Arrays.copyOf(a, 5);          // extra places get 0
        System.out.println("Arrays.copyOf(a, 5):    " + Arrays.toString(longer));

        int[] part = new int[2];
        System.arraycopy(a, 1, part, 0, 2);          // from a[1], 2 elements, into part[0]
        System.out.println("System.arraycopy part:  " + Arrays.toString(part));
    }
}
