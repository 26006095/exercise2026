package W03;

import java.util.Scanner;

// Tutorial 2, question 7: write a Java program that converts inches to meters.
// (Given 1 inch equals to 2.54 centimeters.) Print the output in two decimal places.
public class W03T07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length in inches: ");
        double inches = in.nextDouble();
        double meters = inches * 2.54 / 100;   // inches -> centimeters -> meters
        System.out.printf("%.2f inches = %.2f meters%n", inches, meters);
        in.close();
    }
}
