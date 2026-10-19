package W06;

// new creates an array and fills every element with a default value:
// 0 for numbers, false for boolean, null for objects such as String, and the character with code 0 for char.
public class W06E02 {
    public static void main(String[] args) {
        double[] prices = new double[4];
        boolean[] paid = new boolean[3];
        String[] names = new String[2];
        char[] codes = new char[2];
        System.out.println("prices[0] = " + prices[0]);
        System.out.println("paid[0]   = " + paid[0]);
        System.out.println("names[0]  = " + names[0]);
        System.out.println("codes[0]  = " + (int) codes[0] + " (as a number)");
        System.out.println("Lengths: " + prices.length + ", " + paid.length + ", " + names.length + ", " + codes.length);
    }
}
