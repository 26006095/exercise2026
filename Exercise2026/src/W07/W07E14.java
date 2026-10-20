package W07;

import java.util.Arrays;

// The method gets a copy of the reference, so it reaches the same array: changing elements changes the caller's array.
// Giving the parameter a new array changes only the copy of the reference: the caller's array is not affected.
public class W07E14 {
    static void addToAll(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            a[i] += n;
        }
    }

    static void replace(int[] a) {
        a = new int[] {0, 0, 0};
        System.out.println("inside replace: " + Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] scores = {10, 20, 30};
        addToAll(scores, 5);
        System.out.println("after addToAll: " + Arrays.toString(scores));
        replace(scores);
        System.out.println("after replace:  " + Arrays.toString(scores));
    }
}
