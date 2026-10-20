package W03;

import java.util.Scanner;

public class W03L06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input exactly as shown in the sample
        System.out.print("Enter the amount of water in gram: ");
        double gram = input.nextDouble();

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialFahrenheit = input.nextDouble();

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalFahrenheit = input.nextDouble();

        // The formula needs M in kg, so convert gram to kg
        double M = gram / 1000;

        // The formula needs Celsius, so convert Fahrenheit to Celsius
        double initialTemperature = (initialFahrenheit - 32) / 1.8;
        double finalTemperature = (finalFahrenheit - 32) / 1.8;

        // Q = M * (final temperature - initial temperature) * 4184
        double Q = M * (finalTemperature - initialTemperature) * 4184;

        System.out.printf("The energy needed is %e%n", Q);

        input.close();
    }
}