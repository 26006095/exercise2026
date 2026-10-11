package W05;

import java.util.stream.IntStream;

/// Modern Java: repeat without a loop variable, and keep a value in range.
///
/// - `_` (JDK 22) is an unnamed variable: use it when the value is never needed.
/// - `Math.clamp` (JDK 21) keeps a value between a minimum and a maximum.
/// - This comment is a Markdown documentation comment (JDK 23): `///` instead of `/** ... */`.
public class W05E22 {
    public static void main(String[] args) {
        IntStream.range(0, 3).forEach(_ -> System.out.println("Practice makes progress"));

        System.out.println(Math.clamp(130, 0, 100));   // above the maximum: 100
        System.out.println(Math.clamp(-5, 0, 100));    // below the minimum: 0
        System.out.println(Math.clamp(72, 0, 100));    // in range: unchanged, 72
    }
}
