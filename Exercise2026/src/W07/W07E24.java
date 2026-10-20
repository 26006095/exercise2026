package W07;

/// Modern Java for methods (good to know).
/// - A `switch` expression can be the value a method returns (Java 14): each `case ->` gives a result.
/// - `///` lines like these are a Markdown documentation comment (JDK 23), an alternative to `/** */`.
public class W07E24 {
    /// Returns the number of days in a month of a year that is not a leap year.
    /// Precondition: `month` is 1 to 12.
    static int daysIn(int month) {
        return switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    /// Returns the word for a coffee size code.
    static String sizeName(char size) {
        return switch (size) {
            case 'S' -> "small";
            case 'M' -> "medium";
            case 'L' -> "large";
            default -> "unknown";
        };
    }

    public static void main(String[] args) {
        System.out.println("Feb: " + daysIn(2) + ", Apr: " + daysIn(4) + ", Dec: " + daysIn(12));
        System.out.println("M is " + sizeName('M') + ", X is " + sizeName('X'));
    }
}
