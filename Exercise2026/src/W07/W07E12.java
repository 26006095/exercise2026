package W07;

// Methods from the Java library and from another class.
// Call a static method of another class with ClassName.methodName(...): W07E04.bmi is reused here.
public class W07E12 {
    public static void main(String[] args) {
        System.out.println("Math.max(7, 12) = " + Math.max(7, 12));
        System.out.println("Math.sqrt(2.25) = " + Math.sqrt(2.25));
        System.out.println("Math.pow(2, 10) = " + Math.pow(2, 10));
        int n = Integer.parseInt("42");
        System.out.println("Integer.parseInt(\"42\") + 1 = " + (n + 1));
        System.out.printf("W07E04.bmi(70, 1.75) = %.2f%n", W07E04.bmi(70, 1.75));
    }
}
