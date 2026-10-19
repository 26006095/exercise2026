package W06;

import java.util.Arrays;

// Try it answer for video #31 (try it yourself first): make a real copy of the prices,
// take 10% off every price in the copy, then show that the original prices did not change.
public class W06E28 {
    public static void main(String[] args) {
        double[] prices = {20.0, 15.0, 8.0};
        double[] sale = Arrays.copyOf(prices, prices.length);
        for (int i = 0; i < sale.length; i++) {
            sale[i] = sale[i] * 0.9;
        }
        System.out.println("Prices: " + Arrays.toString(prices));
        System.out.println("Sale:   " + Arrays.toString(sale));
    }
}
