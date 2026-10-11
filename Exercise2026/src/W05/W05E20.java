package W05;

// Modern Java (JDK 25): an instance main method, void main(), and IO.readln / IO.println (no Scanner).
// var (Java 10) lets Java work out the type. A loop and a half: read commands until quit (any case).
// Try with: hello, list, QUIT
class W05E20 {
    void main() {
        var count = 0;
        while (true) {
            var cmd = IO.readln("Command (quit to stop): ");
            if (cmd == null || cmd.equalsIgnoreCase("quit")) {   // null: the input has ended
                break;
            }
            count++;
            IO.println("Command " + count + ": " + cmd.toUpperCase());
        }
        IO.println(count + " commands");
    }
}
