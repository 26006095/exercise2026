package W05;

// Worked example: a cinema seat chart.
// IPO. Data: 5 rows (A to E) and 8 seats per row. Process: for each row, for each seat, decide
// booked (X) or free (seat number); an aisle after seat 4. Output: the chart and the number of free seats.
// Booking rule for this test: seat s in row r (A = 1) is booked when (r + s) % 4 == 0.
// Tests: 40 seats in total; 10 booked, so 30 free. Row A: seats 3 and 7 booked.
public class W05E16 {
    public static void main(String[] args) {
        int rows = 5, seats = 8;
        int free = 0;
        for (int r = 1; r <= rows; r++) {
            char row = (char) ('A' + r - 1);
            System.out.print(row + "  ");
            for (int s = 1; s <= seats; s++) {
                if ((r + s) % 4 == 0) {
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
