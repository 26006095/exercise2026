package W06;

import java.util.Scanner;

// Binary search on a SORTED array: look at the middle, then keep only the half that can hold the key.
// The trace shows low, middle and high at each step. Try with: 30, then 13
public class W06E14 {
    public static void main(String[] args) {
        int[] stops = {3, 8, 12, 17, 21, 26, 30, 34, 41, 45};
        Scanner in = new Scanner(System.in);
        System.out.print("Bus stop number: ");
        int key = in.nextInt();

        int low = 0, high = stops.length - 1;
        int found = -1;
        System.out.println("low  mid  high  stops[mid]");
        while (low <= high) {
            int mid = (low + high) / 2;
            System.out.printf("%3d  %3d  %4d  %10d%n", low, mid, high, stops[mid]);
            if (stops[mid] == key) {
                found = mid;
                break;
            } else if (key < stops[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(found >= 0 ? "Found at index " + found : "Not found");
        in.close();
    }
}
