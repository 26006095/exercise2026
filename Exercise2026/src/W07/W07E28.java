package W07;

import java.util.Arrays;

// Fix of W07E27: swap(int a, int b) swapped only its own copies (pass-by-value), so main saw no change.
// Keep the scores in an array and swap two elements: the method reaches the caller's array through the reference.
public class W07E28 {
    static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] scores = {85, 72};
        swap(scores, 0, 1);
        System.out.println("scores = " + Arrays.toString(scores));
    }
}
