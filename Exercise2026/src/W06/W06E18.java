package W06;

// main receives the command-line words as an array: String[] args. Run with no words, and args.length is 0.
// split cuts a String at a separator and returns the parts as an array.
public class W06E18 {
    public static void main(String[] args) {
        System.out.println("Words given to main: " + args.length);
        for (String word : args) {
            System.out.println("  " + word);
        }

        String route = "KL,Ipoh,Penang";
        String[] towns = route.split(",");
        System.out.println("Towns: " + towns.length);
        for (int i = 0; i < towns.length; i++) {
            System.out.println((i + 1) + ". " + towns[i]);
        }
    }
}
