package W07;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

// Methods as values (good to know, Java 8): a method reference (W07E25::square) or a lambda (x -> x + 1)
// can be stored in a variable and passed to another method, such as a stream's map.
public class W07E25 {
    static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        IntUnaryOperator f = W07E25::square;
        IntUnaryOperator next = x -> x + 1;
        System.out.println("f(7) = " + f.applyAsInt(7));
        System.out.println("next(7) = " + next.applyAsInt(7));
        int total = IntStream.of(1, 2, 3, 4).map(W07E25::square).sum();
        System.out.println("1 + 4 + 9 + 16 = " + total);
    }
}
