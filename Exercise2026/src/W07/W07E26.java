package W07;

// Worked example: a weekly pay slip built from small methods.
// IPO. Input: name, hours worked, hourly rate. Process: gross pay (hours above 40 paid at 1.5 times the rate),
// a deduction of 11% of gross, net pay. Output: one slip per worker.
// Tests (by hand): 38 h at RM12: gross 456.00, deduction 50.16, net 405.84.
//                  45 h at RM10: 40 x 10 + 5 x 15 = 475.00, deduction 52.25, net 422.75.
public class W07E26 {
    static double grossPay(double hours, double rate) {
        if (hours <= 40) {
            return hours * rate;
        }
        return 40 * rate + (hours - 40) * rate * 1.5;
    }

    static double deduction(double gross) {
        return gross * 0.11;
    }

    static void printSlip(String name, double hours, double rate) {
        double gross = grossPay(hours, rate);
        double cut = deduction(gross);
        System.out.printf("%-8s gross RM%7.2f  deduction RM%6.2f  net RM%7.2f%n", name, gross, cut, gross - cut);
    }

    public static void main(String[] args) {
        printSlip("Aiman", 38, 12.00);
        printSlip("Mei Ling", 45, 10.00);
    }
}
