package W06;

// Try it answer for video #34 (try it yourself first): use the freezer readings of W06E25.
// Count how many readings are colder than -19 C, and test it by hand first (expected: 2).
public class W06E31 {
    public static void main(String[] args) {
        int[] freezer = {-18, -21, -16, -19, -20};
        int cold = 0;
        for (int t : freezer) {
            if (t < -19) {
                cold++;
            }
        }
        System.out.println("Readings colder than -19 C: " + cold);
    }
}
