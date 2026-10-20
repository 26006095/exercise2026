package W07;

// Try it answer for video #40 (try it yourself first): a method that returns a switch expression.
// dayType(1) to dayType(5) give "weekday"; 6 and 7 give "weekend".
public class W07E34 {
    static String dayType(int day) {
        return switch (day) {
            case 6, 7 -> "weekend";
            default -> "weekday";
        };
    }

    public static void main(String[] args) {
        System.out.println("day 3: " + dayType(3));
        System.out.println("day 6: " + dayType(6));
    }
}
