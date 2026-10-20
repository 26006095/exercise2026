package W07;

// The W06E13 linear search as a method: return the index as soon as the key is found, or -1 at the end.
public class W07E16 {
    static int indexOf(String[] codes, String key) {
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] codes = {"QA76", "PZ7", "HD30", "QA402", "TK5105"};
        System.out.println("QA402 at index " + indexOf(codes, "QA402"));
        System.out.println("Z1 at index " + indexOf(codes, "Z1"));
    }
}
