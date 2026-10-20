package W07;

// Try it answer for video #37 (try it yourself first): two overloaded methods called label.
// label(3) gives "3 items"; label(3, "kg") gives "3 kg".
public class W07E31 {
    static String label(int qty) {
        return qty + " items";
    }

    static String label(int qty, String unit) {
        return qty + " " + unit;
    }

    public static void main(String[] args) {
        System.out.println(label(3));
        System.out.println(label(3, "kg"));
    }
}
