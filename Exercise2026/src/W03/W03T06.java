package W03;

import java.util.Scanner;

// Tutorial 2, question 6: read the diameter, print the circumference of the circle (3 decimal places).
public class W03T06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        double diameter = in.nextDouble();
        double circumference = Math.PI * diameter;   // circumference = pi x diameter
        System.out.printf("Circumference = %.3f%n", circumference);
        in.close();
    }
}
