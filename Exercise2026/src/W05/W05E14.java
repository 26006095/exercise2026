package W05;

// For fixed decimal steps, control the loop with an int and compute the decimal from it.
// 0.1 cannot be stored exactly in a double, so the errors add up: the double loop never prints 1.0.
public class W05E14 {
    public static void main(String[] args) {
        System.out.println("double counter:");
        for (double x = 0.0; x <= 1.0; x += 0.1) {
            System.out.println("  " + x);
        }
        System.out.println("int counter:");
        for (int i = 0; i <= 10; i++) {
            System.out.println("  " + i / 10.0);
        }
    }
}
