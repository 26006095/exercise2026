package W06;

// A 2D array: the W05E16 seat chart, now stored. booked[r][s] is row r, seat s (both from 0).
// booked.length is the number of rows; booked[r].length is the number of seats in row r.
// Same booking rule as W05E16 (10 booked, 30 free), plus one more booking, so 29 seats are free.
public class W06E19 {
    public static void main(String[] args) {
        boolean[][] booked = new boolean[5][8];
        for (int r = 0; r < booked.length; r++) {
            for (int s = 0; s < booked[r].length; s++) {
                booked[r][s] = (r + 1 + s + 1) % 4 == 0;
            }
        }
        booked[4][0] = true;       // one more booking: row E, seat 1

        int free = 0;
        for (int r = 0; r < booked.length; r++) {
            System.out.print((char) ('A' + r) + "  ");
            for (int s = 0; s < booked[r].length; s++) {
                if (booked[r][s]) {
                    System.out.print(" X");
                } else {
                    System.out.print(" " + (s + 1));
                    free++;
                }
                if (s == 3) {
                    System.out.print("   ");     // the aisle
                }
            }
            System.out.println();
        }
        System.out.println("Free seats: " + free);
    }
}
