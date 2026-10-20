package W07;

// Try it answer for video #39 (try it yourself first): the largest element, found with recursion.
// maxFrom(a, i) is the larger of a[i] and maxFrom(a, i + 1); the base case is the last element.
// Precondition: a has at least one element.
public class W07E33 {
    static int maxFrom(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        return Math.max(a[i], maxFrom(a, i + 1));
    }

    public static void main(String[] args) {
        int[] heights = {152, 167, 149, 171, 160};
        System.out.println("Tallest: " + maxFrom(heights, 0) + " cm");
    }
}
