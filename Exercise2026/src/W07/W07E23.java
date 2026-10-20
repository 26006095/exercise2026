package W07;

// Recursion or a loop? Both give the same answer here. A loop is usually simpler for counting;
// recursion fits problems that split into smaller copies of themselves (like binary search).
// Without a base case, recursion never stops: the stack fills up and Java throws StackOverflowError.
public class W07E23 {
    // Precondition for both methods: n is even and 0 or more.
    static int evenSumLoop(int n) {   // 2 + 4 + ... + n
        int s = 0;
        for (int i = 2; i <= n; i += 2) {
            s += i;
        }
        return s;
    }

    static int evenSumRec(int n) {
        if (n == 0) {   // base case
            return 0;
        }
        return n + evenSumRec(n - 2);
    }

    static int noBase(int n) {
        return n + noBase(n - 2);   // no base case
    }

    public static void main(String[] args) {
        System.out.println("loop:      " + evenSumLoop(100));
        System.out.println("recursion: " + evenSumRec(100));
        // System.out.println(noBase(100));   // Try it: Exception in thread "main" java.lang.StackOverflowError
    }
}
