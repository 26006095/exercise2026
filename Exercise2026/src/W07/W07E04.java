package W07;

// A method can return a value: the Week 2 BMI calculation (W02E27) as a method.
// The return type (double) says what comes back; the caller can store it or use it in an expression.
public class W07E04 {
    static double bmi(double kg, double m) {
        return kg / (m * m);
    }

    public static void main(String[] args) {
        double b1 = bmi(70, 1.75);
        System.out.printf("BMI 1 = %.2f%n", b1);
        double b2 = bmi(55, 1.60);
        System.out.printf("BMI 2 = %.2f%n", b2);
        if (bmi(90, 1.70) >= 25.0) {
            System.out.println("BMI 3 is 25 or more");
        }
    }
}
