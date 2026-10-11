package W05;

// A pyramid: each row needs spaces first, then stars. Row i has (height - i) spaces and (2i - 1) stars.
public class W05E05 {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            for (int s = 1; s <= height - i; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
