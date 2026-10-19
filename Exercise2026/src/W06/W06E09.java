package W06;

import java.util.Random;

// An array as a set of counters: roll a die 600 times and count each face.
// count[face] goes up by one for each roll; count[0] is not used, so the index matches the face.
// new Random(1002) uses a fixed seed, so the counts are the same on every run.
public class W06E09 {
    public static void main(String[] args) {
        Random rng = new Random(1002);
        int[] count = new int[7];
        for (int roll = 1; roll <= 600; roll++) {
            int face = rng.nextInt(1, 7);
            count[face]++;
        }
        for (int face = 1; face <= 6; face++) {
            System.out.printf("%d: %3d  ", face, count[face]);
            for (int k = 0; k < count[face] / 10; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
