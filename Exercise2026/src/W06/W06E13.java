package W06;

import java.util.Scanner;

// Linear search: check each element from the start until the key is found.
// found stays -1 if no element matches. Works on unsorted data. Try with: QA402, then Z1
public class W06E13 {
    public static void main(String[] args) {
        String[] codes = {"QA76", "PZ7", "HD30", "QA402", "TK5105"};
        Scanner in = new Scanner(System.in);
        System.out.print("Book code: ");
        String key = in.next();

        int found = -1;
        int checks = 0;
        for (int i = 0; i < codes.length; i++) {
            checks++;
            if (codes[i].equals(key)) {
                found = i;
                break;
            }
        }
        if (found >= 0) {
            System.out.println("Found at index " + found + " after " + checks + " checks");
        } else {
            System.out.println("Not found after " + checks + " checks");
        }
        in.close();
    }
}
