package W07;

// Pass-by-value: the method gets a copy of the argument's value.
// Changing the parameter changes only the copy; the caller's variable keeps its value.
public class W07E06 {
    static void addBonus(int points) {
        points = points + 10;
        System.out.println("inside addBonus: points = " + points);
    }

    public static void main(String[] args) {
        int points = 50;
        addBonus(points);
        System.out.println("back in main:    points = " + points);
    }
}
