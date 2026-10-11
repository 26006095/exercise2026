package W05;

// Adding decimals: the order and the type change the answer.
// The exact sum of 0.01 + 0.02 + ... + 1.00 is 50.5.
public class W05E15 {
    public static void main(String[] args) {
        float floatUp = 0, floatDown = 0;
        double doubleUp = 0, doubleDown = 0;
        for (int k = 1; k <= 100; k++) {
            floatUp += k / 100.0f;
            doubleUp += k / 100.0;
        }
        for (int k = 100; k >= 1; k--) {
            floatDown += k / 100.0f;
            doubleDown += k / 100.0;
        }
        System.out.println("float,  small to large: " + floatUp);
        System.out.println("float,  large to small: " + floatDown);
        System.out.println("double, small to large: " + doubleUp);
        System.out.println("double, large to small: " + doubleDown);
    }
}
