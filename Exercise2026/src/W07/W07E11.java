package W07;

// A documentation comment (/** ... */) above a method: what it needs and what it gives back.
// Precondition: what must be true before the call. Postcondition: what is true after it.
// In VS Code, hover over a call to see this text.
public class W07E11 {
    /**
     * Returns the fare for a bus trip.
     * Precondition: stops is 1 or more.
     * Postcondition: the fare is RM1.00 for the first stop plus RM0.40 for each extra stop.
     *
     * @param stops the number of stops travelled
     * @return the fare in ringgit
     */
    static double fare(int stops) {
        return 1.00 + (stops - 1) * 0.40;
    }

    public static void main(String[] args) {
        System.out.printf("1 stop:  RM%.2f%n", fare(1));
        System.out.printf("6 stops: RM%.2f%n", fare(6));
    }
}
