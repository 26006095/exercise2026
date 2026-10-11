package W05;

// A labelled continue goes straight to the next pass of the OUTER loop.
// Seat chart: when a row reaches a broken seat, the rest of that row is closed.
public class W05E12 {
    public static void main(String[] args) {
        rows:
        for (char row = 'A'; row <= 'D'; row++) {
            System.out.print(row + ": ");
            for (int seat = 1; seat <= 6; seat++) {
                boolean broken = (row == 'B' && seat == 4) || (row == 'D' && seat == 2);
                if (broken) {
                    System.out.println("(rest of row closed)");
                    continue rows;     // next row
                }
                System.out.print(row + "" + seat + " ");
            }
            System.out.println();
        }
    }
}
