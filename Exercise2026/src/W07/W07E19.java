package W07;

// Three method mistakes the compiler catches. Each Try it line is commented out: remove the first //, read the message, then put it back.
public class W07E19 {
    // 1. A non-void method must return a value on every path.
    static int discount(int qty) {
        if (qty >= 10) {
            return 15;
        }
        return 0;   // Try it: remove this line. Message: This method must return a result of type int
    }

    // 2. A void method gives back nothing, so it cannot be used as a value.
    static void showQty(int qty) {
        System.out.println("qty = " + qty);
    }

    // 3. Nothing can run after return in the same block.
    static int doubleIt(int n) {
        return n * 2;
        // System.out.println("done");   // Try it: Unreachable code
    }

    public static void main(String[] args) {
        System.out.println("discount(12) = " + discount(12) + "%");
        showQty(3);
        // int q = showQty(3);   // Try it: Type mismatch: cannot convert from void to int
        System.out.println("doubleIt(21) = " + doubleIt(21));
    }
}
