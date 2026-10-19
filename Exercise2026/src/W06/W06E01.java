package W06;

// Why arrays: seven step counts in seven variables need a long sum, and more days mean more variables.
// One array holds all seven values, and one loop adds them, however many days there are.
public class W06E01 {
    public static void main(String[] args) {
        int mon = 8200, tue = 6400, wed = 10300, thu = 7500, fri = 9100, sat = 12000, sun = 5600;
        int total1 = mon + tue + wed + thu + fri + sat + sun;
        System.out.println("Total (7 variables): " + total1);

        int[] steps = {8200, 6400, 10300, 7500, 9100, 12000, 5600};
        int total2 = 0;
        for (int i = 0; i < steps.length; i++) {
            total2 += steps[i];
        }
        System.out.println("Total (one array):   " + total2);
        System.out.println("Days in the array:   " + steps.length);
    }
}
