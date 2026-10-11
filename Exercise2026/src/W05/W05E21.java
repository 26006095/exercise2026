package W05;

import java.util.stream.IntStream;

// Modern Java: a stream can do the work of a loop. Good to know; the labs use for and while.
// Java 8: streams, filter and findFirst. Java 9: takeWhile.
// filter plays a role similar to continue (W05E09), findFirst similar to break (W05E07),
// and takeWhile stops at the first false test.
public class W05E21 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, 20)
                .filter(n -> n % 3 != 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();

        int first = IntStream.iterate(101, n -> n + 1)
                .filter(n -> n % 13 == 0)
                .findFirst()
                .getAsInt();
        System.out.println("First multiple of 13 above 100: " + first);

        IntStream.of(27, 28, 29, 31, 26)              // temperature readings
                .takeWhile(t -> t < 30)               // stop at the first reading of 30 or more
                .forEach(t -> System.out.print(t + " "));
        System.out.println();
    }
}
