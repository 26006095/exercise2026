package W07;

// Variable-length arguments: int... nums lets the caller pass any number of ints.
// Inside the method, nums is an array.
public class W07E18 {
    static int sum(int... nums) {
        int s = 0;
        for (int n : nums) {
            s += n;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("sum()        = " + sum());
        System.out.println("sum(4)       = " + sum(4));
        System.out.println("sum(1, 2, 3) = " + sum(1, 2, 3));
        int[] week = {3, 5, 2};
        System.out.println("sum(week)    = " + sum(week));
    }
}
