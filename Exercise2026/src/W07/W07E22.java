package W07;

// Recursion on arrays.
// sumFrom: the sum from index i is a[i] plus the sum from i + 1; the base case is the end of the array.
// find: the W06E14 binary search written recursively; each call searches half of the range.
public class W07E22 {
    static int sumFrom(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + sumFrom(a, i + 1);
    }

    // Precondition: a is sorted in ascending order (binary search needs it).
    static int find(int[] a, int key, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (a[mid] == key) {
            return mid;
        } else if (key < a[mid]) {
            return find(a, key, low, mid - 1);
        } else {
            return find(a, key, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] parcels = {3, 1, 4, 2};
        System.out.println("sum = " + sumFrom(parcels, 0));
        int[] stops = {3, 8, 12, 17, 21, 26, 30, 34, 41, 45};
        System.out.println("30 at index " + find(stops, 30, 0, stops.length - 1));
        System.out.println("13 at index " + find(stops, 13, 0, stops.length - 1));
    }
}
