package W07;

// The call stack: main calls checkIn, checkIn calls printBadge. Each call waits until the method it called returns.
public class W07E05 {
    static void printBadge(String name) {
        System.out.println("    enter printBadge");
        System.out.println("    [ VISITOR: " + name + " ]");
        System.out.println("    leave printBadge");
    }

    static void checkIn(String name) {
        System.out.println("  enter checkIn");
        printBadge(name);
        System.out.println("  leave checkIn");
    }

    public static void main(String[] args) {
        System.out.println("enter main");
        checkIn("Aisyah");
        System.out.println("leave main");
    }
}
