package W07;

import java.util.Arrays;

// A method can return an array: here a new, scaled copy. The original array is kept.
public class W07E15 {
    static int[] copyAndScale(int[] a, int factor) {
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i] * factor;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] grams = {120, 80, 250};
        int[] doubled = copyAndScale(grams, 2);
        System.out.println("recipe:  " + Arrays.toString(grams));
        System.out.println("doubled: " + Arrays.toString(doubled));
    }
}
