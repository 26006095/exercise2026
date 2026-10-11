package W05;

// break stops the loop at once. Find the first multiple of 13 greater than 100, then stop looking.
public class W05E07 {
    public static void main(String[] args) {
        int checked = 0;
        for (int n = 101; n <= 200; n++) {
            checked++;
            if (n % 13 == 0) {
                System.out.println("First multiple of 13 above 100: " + n);
                break;
            }
        }
        System.out.println("Numbers checked: " + checked);
    }
}
