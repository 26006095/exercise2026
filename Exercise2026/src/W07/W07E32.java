package W07;

// Try it answer for video #38 (try it yourself first): a method countAbove(a, limit) that returns how many
// elements are greater than limit. Bus delays in minutes: 0, 5, 12, 3, 20; count the delays above 10.
public class W07E32 {
    static int countAbove(int[] a, int limit) {
        int count = 0;
        for (int x : a) {
            if (x > limit) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] delays = {0, 5, 12, 3, 20};
        System.out.println("Delays above 10 minutes: " + countAbove(delays, 10));
    }
}
