package W07;

// Overloading: two methods with the same name but different parameter lists.
// Java picks the method whose parameters match the arguments.
public class W07E10 {
    static double shippingCost(double kg) {
        return 5.00 + kg * 2.00;
    }

    static double shippingCost(double kg, boolean express) {
        double cost = shippingCost(kg);
        if (express) {
            cost = cost * 1.5;
        }
        return cost;
    }

    public static void main(String[] args) {
        System.out.printf("2.0 kg, normal:  RM%.2f%n", shippingCost(2.0));
        System.out.printf("2.0 kg, express: RM%.2f%n", shippingCost(2.0, true));
        System.out.printf("0.5 kg, normal:  RM%.2f%n", shippingCost(0.5, false));
    }
}
