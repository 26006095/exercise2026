package W06;

import java.util.Arrays;

// Moving elements inside one array.
// Rotate left: keep the first, shift the rest one place left, put the first at the end.
// Reverse: swap the two ends and move both indexes inwards until they meet.
public class W06E12 {
    public static void main(String[] args) {
        String[] playlist = {"Song A", "Song B", "Song C", "Song D"};
        String first = playlist[0];
        for (int i = 0; i < playlist.length - 1; i++) {
            playlist[i] = playlist[i + 1];
        }
        playlist[playlist.length - 1] = first;
        System.out.println("Rotated: " + Arrays.toString(playlist));

        int[] floors = {1, 3, 5, 7, 9, 11};
        int left = 0, right = floors.length - 1;
        while (left < right) {
            int temp = floors[left];
            floors[left] = floors[right];
            floors[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed: " + Arrays.toString(floors));
    }
}
