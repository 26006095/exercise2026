package W07;

// Define a method once, call it many times. A call jumps to the method, runs its body, then comes back.
public class W07E02 {
    static void printHeader() {
        System.out.println("==========================");
        System.out.println("  FSKTM Cafe, Universiti Malaya");
        System.out.println("==========================");
    }

    public static void main(String[] args) {
        printHeader();
        System.out.println("Receipt 1: RM 8.50");
        printHeader();
        System.out.println("Receipt 2: RM 4.20");
        printHeader();
        System.out.println("Receipt 3: RM 12.00");
    }
}
