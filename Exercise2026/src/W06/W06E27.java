package W06;

// Try it answer for video #30 (try it yourself first): rainfall (mm) for 7 days.
// Count the dry days (0.0 mm) and find the wettest day (its day number, from 1).
public class W06E27 {
    public static void main(String[] args) {
        double[] rain = {0.0, 12.5, 3.0, 0.0, 27.5, 8.0, 0.0};
        int dry = 0;
        int wettest = 0;
        for (int i = 0; i < rain.length; i++) {
            if (rain[i] == 0.0) {
                dry++;
            }
            if (rain[i] > rain[wettest]) {
                wettest = i;
            }
        }
        System.out.println("Dry days: " + dry);
        System.out.println("Wettest: day " + (wettest + 1) + " (" + rain[wettest] + " mm)");
    }
}
