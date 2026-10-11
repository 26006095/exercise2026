package W05;

// break vs continue on the same loop: break stops the whole loop, continue skips only one pass.
public class W05E10 {
    public static void main(String[] args) {
        System.out.print("break:    ");
        for (int i = 1; i <= 8; i++) {
            if (i == 4) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("continue: ");
        for (int i = 1; i <= 8; i++) {
            if (i == 4) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
