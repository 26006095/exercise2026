package W05;

import java.util.Scanner;

// Loop and a half: while (true) repeats, and break leaves in the middle of the body.
// Compare W04E05: the same task with the read-before-the-loop sentinel pattern.
// Try with: 12.50 3.90 8.00 0
public class W05E08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        double total = 0;
        while (true) {
            System.out.print("Price (0 or less to finish): ");
            double price = in.nextDouble();
            if (price <= 0) {
                break;                 // leave before the price is added
            }
            total = total + price;
            count++;
        }
        System.out.printf("%d items, total RM %.2f%n", count, total);
        in.close();
    }
}
