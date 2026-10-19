package W06;

// Fix of W06E24: max started at 0, which is higher than every reading, so it never changed.
// Start with the first element instead; then the answer always comes from the data.
public class W06E25 {
    public static void main(String[] args) {
        int[] freezer = {-18, -21, -16, -19, -20};
        int max = freezer[0];
        for (int i = 1; i < freezer.length; i++) {
            if (freezer[i] > max) {
                max = freezer[i];
            }
        }
        System.out.println("Highest temperature: " + max + " C");
    }
}
