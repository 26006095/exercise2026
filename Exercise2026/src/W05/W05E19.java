package W05;

// Modern Java (Java 11): String.repeat(n) builds n copies of a String,
// so the W05E05 pyramid needs only ONE loop: no inner loops for the spaces and the stars.
public class W05E19 {
    public static void main(String[] args) {
        int height = 5;
        for (int i = 1; i <= height; i++) {
            System.out.println(" ".repeat(height - i) + "*".repeat(2 * i - 1));
        }
    }
}
