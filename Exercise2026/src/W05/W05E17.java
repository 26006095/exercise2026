package W05;

// INTENTIONALLY FAULTY (AI agent check). Task given to the agent: "in a hall of 5 rows and 8 seats,
// find the FIRST seat (row r, seat s, both from 1) where r x s is greater than 20, and print it.
// Search rows 1 to 5 in order, and seats 1 to 8 within each row."
// The agent wrote this. It compiles and prints a seat, but not the first one.
// Expected: row 3, seat 7 (3 x 7 = 21).
public class W05E17 {
    public static void main(String[] args) {
        int foundRow = 0, foundSeat = 0;
        for (int r = 1; r <= 5; r++) {
            for (int s = 1; s <= 8; s++) {
                if (r * s > 20) {
                    foundRow = r;
                    foundSeat = s;
                    break;
                }
            }
        }
        System.out.println("First seat: row " + foundRow + ", seat " + foundSeat);
    }
}
