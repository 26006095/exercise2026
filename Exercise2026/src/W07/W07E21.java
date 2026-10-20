package W07;

// A recursive method that returns a value: base^exp = base * base^(exp - 1), and base^0 = 1.
// The trace shows each call waiting on the stack, then the results coming back.
public class W07E21 {
    static int power(int base, int exp, String indent) {
        System.out.println(indent + "power(" + base + ", " + exp + ")");
        if (exp == 0) {
            System.out.println(indent + "  returns 1");
            return 1;
        }
        int result = base * power(base, exp - 1, indent + "  ");
        System.out.println(indent + "  returns " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3, ""));
    }
}
