package W06;

import java.util.Scanner;

// Read 5 parcel weights into an array, then print them with their index. Try with: 1.2 0.5 3.0 2.4 0.8
public class W06E05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double[] weights = new double[5];
        for (int i = 0; i < weights.length; i++) {
            System.out.print("Parcel " + (i + 1) + " weight (kg): ");
            weights[i] = in.nextDouble();
        }
        System.out.println("Index  Weight");
        for (int i = 0; i < weights.length; i++) {
            System.out.printf("%5d  %.1f kg%n", i, weights[i]);
        }
        in.close();
    }
}
