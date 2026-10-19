package W06;

// Total, average and the largest value with its index, in one pass over the array.
// maxIndex starts at 0, so the first comparison uses a real bill, bills[0]. A largest VALUE that starts at 0 fails when every value is negative (W06E24).
public class W06E07 {
    public static void main(String[] args) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};
        double[] bills = {84.50, 79.20, 102.35, 118.90, 125.40, 97.10};

        double total = 0;
        int maxIndex = 0;
        for (int i = 0; i < bills.length; i++) {
            total += bills[i];
            if (bills[i] > bills[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.printf("Total:   RM%.2f%n", total);
        System.out.printf("Average: RM%.2f%n", total / bills.length);
        System.out.printf("Highest: RM%.2f in %s%n", bills[maxIndex], months[maxIndex]);
    }
}
