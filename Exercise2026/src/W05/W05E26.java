package W05;

// Try it answer for video #27 (try it yourself first): the W05E16 seat chart with a new booking rule:
// seat s in row r is booked when (r * s) % 5 == 0. Predict the number of free seats first.
public class W05E26 {
    public static void main(String[] args) {
        int rows = 5, seats = 8;
        int free = 0;
        for (int r = 1; r <= rows; r++) {
            char row = (char) ('A' + r - 1);
            System.out.print(row + "  ");
            for (int s = 1; s <= seats; s++) {
                if ((r * s) % 5 == 0) {
                    System.out.print(" X");
                } else {
                    System.out.print(" " + s);
                    free++;
                }
                if (s == 4) {
                    System.out.print("   ");     // the aisle
                }
            }
            System.out.println();
        }
        System.out.println("Free seats: " + free);
    }
}
