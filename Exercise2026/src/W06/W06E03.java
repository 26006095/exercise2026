package W06;

// An initialiser list creates and fills the array in one step.
// Indexes run from 0 to length - 1, so the last element is at days.length - 1.
public class W06E03 {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        System.out.println("First: " + days[0]);
        System.out.println("Last:  " + days[days.length - 1]);

        days[2] = "Wednesday";     // change one element
        for (int i = 0; i < days.length; i++) {
            System.out.println(i + ": " + days[i]);
        }
    }
}
