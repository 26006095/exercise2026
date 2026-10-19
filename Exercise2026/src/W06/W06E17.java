package W06;

import java.util.Arrays;

// The library way: Arrays.sort sorts in ascending order, Arrays.binarySearch searches a sorted array.
// binarySearch gives the index, or a negative number when the key is not there.
public class W06E17 {
    public static void main(String[] args) {
        int[] rooms = {41, 8, 26, 3, 34, 17};
        Arrays.sort(rooms);
        System.out.println("Sorted: " + Arrays.toString(rooms));
        System.out.println("Index of 26: " + Arrays.binarySearch(rooms, 26));
        System.out.println("Index of 20: " + Arrays.binarySearch(rooms, 20) + " (negative: not found)");

        String[] towns = {"Ipoh", "Alor Setar", "Melaka", "Kuantan"};
        Arrays.sort(towns);
        System.out.println("Sorted: " + Arrays.toString(towns));
    }
}
