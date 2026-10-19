package W06;

// INTENTIONALLY FAULTY (AI agent check). Task given to the agent: "print the highest temperature
// recorded in the freezer over five checks". The agent wrote this. It compiles and runs, but the answer is wrong.
// Expected: -16 C.
public class W06E24 {
    public static void main(String[] args) {
        int[] freezer = {-18, -21, -16, -19, -20};
        int max = 0;
        for (int t : freezer) {
            if (t > max) {
                max = t;
            }
        }
        System.out.println("Highest temperature: " + max + " C");
    }
}
