package W07;

// Method abstraction: main reads like a plan, and each method does one job.
// A coffee order: base price by size, add-ons, then the total.
public class W07E09 {
    // Precondition: size is 'S', 'M' or 'L'.
    static double basePrice(char size) {
        if (size == 'S') {
            return 6.00;
        } else if (size == 'M') {
            return 7.50;
        } else {   // 'L'
            return 9.00;
        }
    }

    static double addOnPrice(int extraShots, boolean oatMilk) {
        double cost = extraShots * 1.50;
        if (oatMilk) {
            cost += 2.00;
        }
        return cost;
    }

    static void printTotal(String drink, double total) {
        System.out.printf("%-14s RM%.2f%n", drink, total);
    }

    public static void main(String[] args) {
        printTotal("Latte (M)", basePrice('M') + addOnPrice(1, false));
        printTotal("Mocha (L)", basePrice('L') + addOnPrice(0, true));
        printTotal("Flat white (S)", basePrice('S') + addOnPrice(2, true));
    }
}
