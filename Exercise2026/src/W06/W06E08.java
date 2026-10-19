package W06;

// Counting with a condition: how many of the 10 days were hotter than 33.0 C, and which days.
public class W06E08 {
    public static void main(String[] args) {
        double[] temps = {32.4, 33.8, 34.1, 31.9, 33.0, 35.2, 32.7, 33.5, 30.8, 34.6};
        int hotDays = 0;
        System.out.print("Hot days:");
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > 33.0) {
                hotDays++;
                System.out.print(" " + (i + 1));
            }
        }
        System.out.println();
        System.out.println("Days above 33.0 C: " + hotDays + " of " + temps.length);
    }
}
