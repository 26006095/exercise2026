package W07;

// Parameters: values passed into a method. The arguments must match the parameters in number and order,
// and each argument type must fit its parameter (an int may go into a double parameter, not the other way round).
public class W07E03 {
    static void printRow(String item, int qty, double price) {
        System.out.printf("%-12s %3d x RM%5.2f = RM%6.2f%n", item, qty, price, qty * price);
    }

    public static void main(String[] args) {
        printRow("Nasi lemak", 2, 5.50);
        printRow("Teh tarik", 3, 2.50);
        printRow("Roti canai", 1, 2.00);
        // printRow(2, "Nasi lemak", 5.50);   // Try it: wrong order. Remove the first //, read the message, then put it back.
    }
}
