package W06;

// Worked example: canteen orders for one morning.
// IPO. Input: the menu (names and prices) and the item number of each order (0 to 3).
// Process: count the orders of each item (an array of counters), find the best-seller, add up the sales.
// Output: a table of item, orders and sales, the best-seller and the total.
// Tests: 15 orders; Roti canai 5, Teh tarik 4, Nasi lemak 3, Mee goreng 3; total RM54.50.
public class W06E23 {
    public static void main(String[] args) {
        String[] menu = {"Nasi lemak", "Mee goreng", "Roti canai", "Teh tarik"};
        double[] price = {5.50, 6.00, 2.00, 2.50};
        int[] orders = {2, 0, 3, 2, 1, 2, 3, 0, 2, 3, 1, 2, 3, 0, 1};

        int[] count = new int[menu.length];
        for (int item : orders) {
            count[item]++;
        }

        double total = 0;
        int best = 0;
        System.out.println("Item         Orders   Sales");
        for (int i = 0; i < menu.length; i++) {
            double sales = count[i] * price[i];
            total += sales;
            if (count[i] > count[best]) {
                best = i;
            }
            System.out.printf("%-12s %6d  RM%5.2f%n", menu[i], count[i], sales);
        }
        System.out.println("Best-seller: " + menu[best]);
        System.out.printf("Total sales: RM%.2f from %d orders%n", total, orders.length);
    }
}
