package W06;

import java.util.Arrays;

// == compares references (same array?), Arrays.equals compares the elements.
// Printing an array directly shows a type code and a hash, not the elements; use Arrays.toString.
public class W06E11 {
    public static void main(String[] args) {
        int[] x = {4, 8, 15};
        int[] y = {4, 8, 15};
        System.out.println("x == y:              " + (x == y));
        System.out.println("Arrays.equals(x, y): " + Arrays.equals(x, y));
        System.out.println("x printed directly:  " + x + "   (the part after @ can change)");
        System.out.println("Arrays.toString(x):  " + Arrays.toString(x));

        char[] line = new char[12];
        Arrays.fill(line, '-');
        System.out.println(new String(line));
    }
}
