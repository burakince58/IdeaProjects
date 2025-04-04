
import java.util.Scanner;

public class InputReader {
    private static final Scanner scanner;

    public InputReader() {
    }

    public static int readInt() {
        Integer value = null;

        do {
            try {
                String line = scanner.nextLine();
                value = Integer.parseInt(line.strip());
            } catch (NumberFormatException var2) {
            }
        } while(value == null);

        return value;
    }

    public static int readInt(String text) {
        System.out.println(text);
        return readInt();
    }

    public static char readChar() {
        String line = "";

        do {
            line = scanner.nextLine();
        } while(line.isEmpty());

        return line.charAt(0);
    }

    public static char readChar(String text) {
        System.out.println(text);
        return readChar();
    }

    public static String readString() {
        String line = "";

        do {
            line = scanner.nextLine();
        } while(line.isEmpty());

        return line;
    }

    public static String readString(String text) {
        System.out.println(text);
        return readString();
    }

    static {
        scanner = new Scanner(System.in);
    }
}