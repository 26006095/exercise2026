package W07;

// INTENTIONALLY FAULTY (AI agent check). Task given to the agent: "write a method that swaps the
// scores of two players, then print them". The agent wrote this. It compiles and runs, but nothing is swapped.
// Expected: first = 72, second = 85.
public class W07E27 {
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        int first = 85, second = 72;
        swap(first, second);
        System.out.println("first = " + first + ", second = " + second);
    }
}
