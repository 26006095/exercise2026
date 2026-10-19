package W06;

import java.util.Scanner;

// Valid indexes are 0 to length - 1. An index that comes from the user must be checked before it is used.
// Try with: 2, then 3, then -1
public class W06E04 {
    public static void main(String[] args) {
        int[] lockers = {101, 102, 103};
        Scanner in = new Scanner(System.in);
        System.out.print("Index (0 to " + (lockers.length - 1) + "): ");
        int i = in.nextInt();
        if (i >= 0 && i < lockers.length) {
            System.out.println("Locker " + lockers[i]);
        } else {
            System.out.println("No such index: " + i);
        }
        // Without the check, index 3 stops the run with:
        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        // System.out.println("Locker " + lockers[i]);   // Try it: remove the first //, enter 3, read the message, then put it back.
        in.close();
    }
}
