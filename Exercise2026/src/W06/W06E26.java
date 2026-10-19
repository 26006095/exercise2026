package W06;

// Try it answer for video #29 (try it yourself first): an array of the days in each month of 2027 (not a leap year).
// Print the days in February (index 1), the days in the last month (use length), and the number of months.
public class W06E26 {
    public static void main(String[] args) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("February: " + days[1] + " days");
        System.out.println("Last month: " + days[days.length - 1] + " days");
        System.out.println("Months: " + days.length);
    }
}
