package W07;

// A boolean method answers a yes/no question; return ends the method at once.
// The mark check of W04E08 as a method: valid marks are 0 to 100.
public class W07E08 {
    static boolean isValidMark(int mark) {
        if (mark < 0) {
            return false;
        }
        if (mark > 100) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] tests = {-5, 0, 75, 100, 101};
        for (int m : tests) {
            System.out.println(m + " valid? " + isValidMark(m));
        }
    }
}
