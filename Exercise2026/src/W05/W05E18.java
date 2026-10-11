package W05;

// Fix of W05E17: the plain break left only the seat loop, so later rows overwrote the answer.
// A labelled break leaves both loops at the first match.
public class W05E18 {
    public static void main(String[] args) {
        int foundRow = 0, foundSeat = 0;
        search:
        for (int r = 1; r <= 5; r++) {
            for (int s = 1; s <= 8; s++) {
                if (r * s > 20) {
                    foundRow = r;
                    foundSeat = s;
                    break search;
                }
            }
        }
        System.out.println("First seat: row " + foundRow + ", seat " + foundSeat);
    }
}
