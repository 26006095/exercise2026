package W06;

// The enhanced for reads each element in turn, with no index.
// Its variable is a copy of the element, so changing it does not change the array; use an index to change elements.
public class W06E06 {
    public static void main(String[] args) {
        int[] points = {12, 7, 20, 15};

        for (int i = 0; i < points.length; i++) {
            System.out.println("points[" + i + "] = " + points[i]);
        }
        for (int p : points) {
            System.out.print(p + " ");
        }
        System.out.println();

        for (int p : points) {
            p = p * 2;              // changes only the copy p
        }
        for (int p : points) {
            System.out.print(p + " ");
        }
        System.out.println("(after the enhanced for: unchanged)");

        for (int i = 0; i < points.length; i++) {
            points[i] = points[i] * 2;
        }
        for (int p : points) {
            System.out.print(p + " ");
        }
        System.out.println("(after the index loop: doubled)");
    }
}
