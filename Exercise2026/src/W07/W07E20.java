package W07;

// Recursion: a method that calls itself on a smaller problem.
// Every recursive method needs a base case that stops it. Here the base case is n == 0.
public class W07E20 {
    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Lift off!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    public static void main(String[] args) {
        countdown(3);
    }
}
