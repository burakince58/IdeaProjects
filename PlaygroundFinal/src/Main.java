// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }
    }
}*/

/*public class Main {
    private void startGingerbreadMachine() throws RuntimeException {
        throw new RuntimeException("The gingerbread machine is not connected to power.");
    }
    public static void main(String[] args) {
        Main main = new Main();
        main.startGingerbreadMachine();
        System.out.print("Starting the gingerbread machine...");

    }
}*/

/*
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("IVAN", "TAIKI", "ALEXEY", "STEPHAN", "SANTIAGO", "COSTANZA");
        String infunTeam = names.stream().filter(name ->
                name.startsWith("S")).collect(Collectors.joining(", "));

        System.out.println("INFUN team: " + infunTeam);
    }
}
 */

//public class Main { public static void main(String[] args) {
//  }}


        /* int[] array; // Declaration

        int n = InputReader.readInt("Quantity: ");
        array = new int[n]; // Create the array
        int i = 0;

        while (i < n) {
            array[i] = InputReader.readInt("Next number: ");
            i = i + 1;
        }

        int result = array[0];
        i = 0; // Initialization
        while (i < array.length) {
            if (array[i] < result) {
                result = array[i];
            }
            i++; // Modification
        }
        System.out.println("Minimum number is "+result);
        */

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What brand is your car?");
        String car = scanner.nextLine();
        String origin = switch (car) {
            case "Audi", "BMW" -> "Germany";
            case "Toyota", "Nissan" -> "Japan";
            case "GMC", "Dodge" -> "US";
            default -> "unknown";
        };
        System.out.println("Your car is from " + origin);
    }
}
 */

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String password = scanner.nextLine();
        String regex = "^[a-zA-Z0-9_-]{7,}$";
        if (password.matches(regex)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username");
        }
    }
}
 */

/*
public class Main {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int num = 5;
        int result = factorial(num);
        System.out.println(num + "! is " + result);
    }
}
 */

/*
public class Main {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder("Hello INFUN Course");
        stringBuilder.append("!");
        stringBuilder.replace( 6, 9, "ITP");
        stringBuilder.delete(9, 19);
        String finalString = stringBuilder.toString();
        System.out.println(finalString);
    }
}

 */

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
//        List<String> names = Arrays.asList("Sarah", "John", "Samantha", "David", "Sophia", "Steven", "Susan");
//        String infunTeam = names.stream()
//                .filter(name -> name.startsWith("S")).collect(Collectors.joining(", "));
//
//        System.out.println("INFUN team: " + infunTeam);

public class Main {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
             Stream.of('c', 'I', 't').map(Character::toUpperCase).forEach(sb::append);
             Stream.of("1", "3").map(Integer::parseInt).forEach(index -> sb.insert(index.intValue(), ' '));
             Stream.of(sb.toString()).forEach(System.out::print);

    }
}

/*
public class Main {
    public static void main(String[] args){

    }
}

 */


