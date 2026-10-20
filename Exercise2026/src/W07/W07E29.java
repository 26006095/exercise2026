package W07;

// Try it answer for video #35 (try it yourself first): a method tip(bill, percent) that returns the tip.
// Use it for a RM48.00 bill with 10% and with 15%.
public class W07E29 {
    static double tip(double bill, int percent) {
        return bill * percent / 100;
    }

    public static void main(String[] args) {
        System.out.printf("10%% tip: RM%.2f%n", tip(48.00, 10));
        System.out.printf("15%% tip: RM%.2f%n", tip(48.00, 15));
    }
}
