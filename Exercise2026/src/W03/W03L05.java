package W03;

import java.util.Random;

public class W03L05 {
    public static void main(String[] args) {
        Random rand = new Random();

        int number = rand.nextInt(10001);

        int digit1 = number / 10000;
        int digit2 = (number / 1000) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 10) % 10;
        int digit5 = number % 10;

        int sum = digit1 + digit2 + digit3 + digit4 + digit5;

        System.out.println("The random number is: " + number);
        System.out.println("The sum of all digits is: " + sum);
    }
}
