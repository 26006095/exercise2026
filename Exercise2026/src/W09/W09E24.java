package W09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

// Worked example: an expense tracker that remembers expenses between runs.
// Input: an expense (item and amount). Process: append it to expenses.csv, then read all lines.
// To start again, delete expenses.csv.
// Output: every expense and the total. Run it a few times with different expenses.
public class W09E24 {
    static final String FILE = "expenses.csv";

    static void addExpense(String item, double amount) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(new FileOutputStream(FILE, true))) {   // append
            out.printf(Locale.ROOT, "%s,%.2f%n", item, amount);   // always a dot: 2.50, never 2,50
        }
    }

    static double showAll() throws FileNotFoundException {
        double total = 0;
        try (Scanner in = new Scanner(new File(FILE))) {
            while (in.hasNextLine()) {
                String[] part = in.nextLine().split(",", -1);
                if (part.length != 2) {
                    continue;                                       // skip a damaged line
                }
                double amount = Double.parseDouble(part[1]);
                total += amount;
                System.out.printf("%-14s RM %7.2f%n", part[0], amount);
            }
        }
        return total;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(System.in).useLocale(Locale.ROOT);   // read 2.50 with a dot on every computer
        System.out.print("Item: ");
        String item = kb.nextLine().replace(",", " ").trim();    // a comma would break the line
        System.out.print("Amount (RM): ");
        if (!kb.hasNextDouble()) {
            System.out.println("Please enter a number such as 2.50.");
            kb.close();
            return;
        }
        double amount = kb.nextDouble();
        kb.close();
        if (item.isEmpty() || amount <= 0 || amount > 10000) {
            System.out.println("Enter an item name and an amount from 0.01 to 10000.");
            return;
        }
        addExpense(item, amount);
        double total = showAll();
        System.out.printf("%-14s RM %7.2f%n", "Total", total);
    }
}
