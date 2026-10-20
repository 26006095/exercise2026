package W07;

// Scope: a variable exists only in the block where it is declared.
// Both methods have a local variable called total: two different variables in two different places.
public class W07E07 {
    static int sumOfFives(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += 5 * i;
        }
        // System.out.println(i);   // Try it: i only exists inside the loop. Remove the first //, read the message, then put it back.
        return total;
    }

    public static void main(String[] args) {
        int total = 100;
        int t = sumOfFives(5);
        System.out.println("sumOfFives(5) = " + t);
        System.out.println("main's total is still " + total);
    }
}
