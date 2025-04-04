// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
/*
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        System.out.println("Hello and welcome!");

        int[] arr = {89, 1, 23, 90, 2};//15,7,88,0};
        int lengh = arr.length;
        int[] brr = new int[lengh];
        int x = 0;
        //System.out.println(" we found x in " + has(arr,x));
        System.out.print("Original array is : ");
        for (int i = 0; i < lengh; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        // SORT
        //for (int j = 0; j < lengh; j++) {}
        for (int k = 0; k < 5; k++)
            for (int i = 0; i < lengh - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
            }

        System.out.print("Sorted Array is : " );
        for (int i = 0; i < lengh; i++) {
            System.out.print(arr[i]+", ");
        }

    }
}
*/



/*
public class Main {
    public static void main(String[] args) {
        /*Queue q1 = new Queue();
        q1.enqueue("Apple");
        q1.enqueue("Banana");
        q1.enqueue("Watermelon");
        String apple = (String) q1.dequeue();
        String banana = (String) q1.dequeue();
        q1.enqueue("Mango");
        q1.enqueue("Strawberry");
        q1.enqueue("Cherry");
        q1.enqueue("Pineapple");*/


        /*for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i);
        }*/

        /*int[] values = new int[]{10, 20, 30, 40, 50};
        int sum = 0;
        int index = 0;

        while (index < values.length) {
            sum += values[index];
            index++;
        }

        System.out.println(sum);*//*


     int januarySales = 120;
        int februarySales = 150;
        int marchSales = 130;

        int totalSales = januarySales + februarySales + marchSales;
        String reportMessage = "The total sales for Q1 is " + totalSales + " units.";

        System.out.println(reportMessage);

        for (int i = 0; i < 8; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i);
        }

*/
        /*
        //FILLING AN ARRAY WITH WHILE LOOP
        Scanner InputReader = new Scanner(in);
        int[] array; // Declaration
        System.out.print( "Enter Quantity: " );
        int n = InputReader.nextInt();
        System.out.println();
        array = new int[n]; // Create the array
        int i = 0;
        while (i < n) {
            System.out.print( "Next number: " );
            array[i] = InputReader.nextInt();
            i = i + 1;
        }
        System.out.print( "Your Numbers: " );
        i=0;
        while (i < n) {
            System.out.print( array[i]+", " );
            i = i + 1;
        }*/

        /*
        //Example: DETERMINE THE MINIMUM WITH A WHILE LOOP

        int[] array = new int[] { 1, 4, -1, 5, 3 }; // Example int array
        System.out.print( "Array Numbers: " );
        int k=0;
        while (k < array.length) {
            System.out.print( array[k]+", " );
            k = k + 1;
        }
        System.out.println();
        // Assumption: array has at least one element;
        // array != null
        int result = array[0];
        int i = 0; // Initialization
        while (i < array.length) {
            if (array[i] < result) {
                result = array[i];
            }
            i++; // Modification
        }
        for (int p = 1; p < array.length; p++) {
            if (array[p] < result) {
            result = array[p];
            }
        }

        System.out.println("Result: "+result); */

        //HOW TO COPY ARRAY
        /*
        float[] copy = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
         */

        //SWITCH CASE CHAR
        /*

         static final char NEW = 'n';
         static final char OPEN = 'o';
         static final char SAVE = 's';
         static final char QUIT = 'q';
         char command = InputReader.readChar("Command: ");
         switch (command) {
         case NEW : createNewFile();
         break;
         case OPEN : openFile();
         break;
         case SAVE : saveFile();
         break;
         case QUIT : exitProgram();
         break;
         default : System.out.println("Unknown command: " + command);
         break;
         }
         */

        //SWITCH CASE INT - Switch Case int
        /*
        int daysOfMonth(int month) {
            int days = 0;
            switch (month) {
                case 1: days = 31; break;
                case 2: days = 28; break;
                case 3: days = 31; break;
                case 4: days = 30; break;
                case 5: days = 31; break;
                case 6: days = 30; break;
                case 7: days = 31; break;
                case 8: days = 31; break;
                case 9: days = 30; break;
                case 10: days = 31; break;
                case 11: days = 30; break;
                case 12: days = 31; break;
            }
            return days;
        }*/

        /*
        switch (month) {
            case 2: days = 28; break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30; break;
            default: days = 31; break;
        }
        return days;
        */

        /*
        //L02E02 REVERSE IT reverse it
        Scanner InputReader = new Scanner(in);
        System.out.print("Enter a positive number: ");
        int number = InputReader.nextInt();
        System.out.print("Reverse of " + number);
        int reverse = 0;
        // Exercise: calculate the inversion of the number
        while(number > 0){
            int residual = number % 10;
            number=number/10;
            reverse = reverse*10+residual;
        }
        System.out.println(" is " + reverse);
         *//*

    }

    static boolean has(long[] array, long x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return true;
            }
        }
        return false;
    }

    // Assumption array != null
    static boolean hasw(long[] array, long x) {
        int i = 0;
        boolean found = false;
        while (!found && i < array.length) {
            if (array[i] == x) {
                found = true;
            }
            i++;
        }
        return found;
    }

}
*/
/*

abstract class Musician {
    @Override
    public String toString() {
        return "Musician";
    }
}
class Singer extends Musician {
    @Override
    public String toString() {
        return "Singer";
    }
}
public class Main {
    public static void main(String[] args) {
        Musician scooter = new Singer();
        System.out.println("What is your profession? " + scooter);
    }
}

*/
/*
        abstract class Writer {
            public static void write() {
                System.out.println("Writing...");
            }
        }
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}
class Programmer extends Writer {
    public static void write() {
        System.out.println("Writing code");
    }
}
public class Main {
    public static void main(String[] args) {
        Writer w = new Author();
        w.write();
    }
}

*/
/*
class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}
class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat says: Meow Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.sound();
    }
}
*/
/*

import java.util.HashMap;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Fact of" + "5"+": "+Playground.factorial(5L));
        System.out.println("Fact of" + "6"+": "+Playground.factorial(6L));
        System.out.println("Fact of" + "7"+": "+Playground.factorial(7L));
        System.out.println("Fact of" + "8"+": "+Playground.factorial(8L));
        System.out.println("Fact of" + "9"+": "+Playground.factorial(9L));
        System.out.println("Fact of" + "10"+": "+Playground.factorial(10L));
        System.out.print("Enter a number: ");

        // Reading the number input from the user
        long userInput = 0;

        if (scanner.hasNextLong()) {
            userInput = scanner.nextLong();
            System.out.println("You entered: " + userInput);
        } else {
            System.out.println("Invalid input. Please enter a valid number.");
        }


        System.out.println("Fact of" + userInput+": "+Playground.factorial(userInput));

        scanner.close();


    }
}
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReadFileToMap {

    public static void main(String[] args) {
        String filePath = "/Users/burakince/IdeaProjects/itp2324itp2324projectwork-thu2mu1burakidenizn/maps/level-3.properties"; // Replace this with the actual file path

        Map<String, Integer> coordinateMap = new HashMap<>();
        int width = 0;
        int height = 0;
        int numberofwall=0;
        int numberofenemies=0;
        int numberoftraps=0;
        int numberofkeys=0;
        int numberofentry=0;
        int numberofexit=0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("="); // Split the line by '=' to separate coordinates and value
                if (parts.length == 2) {
                    String[] coordinates = parts[0].split(","); // Split coordinates by comma
                    int x = Integer.parseInt(coordinates[0]);
                    if (x>width) {width=x;}
                    int y = Integer.parseInt(coordinates[1]);
                    if (y>height) {height=y;}
                    int value = Integer.parseInt(parts[1]);
                    switch (value){
                        case 0:numberofwall++;break;
                        case 1:numberofentry++;break;
                        case 2:numberofexit++;break;
                        case 3:numberoftraps++;break;
                        case 4:numberofenemies++;break;
                        case 5:numberofkeys++;break;
                    }
                    String coordinateKey = coordinates[0] + "," + coordinates[1];
                    coordinateMap.put(coordinateKey, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print the Map contents
        /*for (Map.Entry<String, Integer> entry : coordinateMap.entrySet()) {
            System.out.println("Coordinate: " + entry.getKey() + ", Value: " + entry.getValue());
        }*/

        width++;height++;
        System.out.println("Maps name: "+filePath.substring(filePath.length()-12));
        System.out.println("Width: "+width+", Height: "+height);
        System.out.println("Number of wall: "+numberofwall);
        System.out.println("Number of entry: "+numberofentry);
        System.out.println("Number of exit: "+numberofexit);
        System.out.println("Number of traps: "+numberoftraps);
        System.out.println("Number of enemies: "+numberofenemies);
        System.out.println("Number of keys: "+numberofkeys);

        for (int i = height-1; i >=0; i--) {
            for (int j = 0; j < width; j++) {
                Integer val = coordinateMap.get((String.valueOf(i)+","+String.valueOf(j)));
                if (val != null){
                    System.out.print(val);
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }

        System.out.println("-----------------**********------------------");



        /*for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Integer val = coordinateMap.get((String.valueOf(i)+","+String.valueOf(j)));
                if (val != null){
                    System.out.print(val);
                }
                else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }*/

        filePath = "/Users/burakince/IdeaProjects/itp2324itp2324projectwork-thu2mu1burakidenizn/maps/level-4.properties"; // Replace this with the actual file path

        coordinateMap.clear();
        width = 0;
        height = 0;
        numberofwall=0;
        numberofenemies=0;
        numberoftraps=0;
        numberofkeys=0;
        numberofentry=0;
        numberofexit=0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("="); // Split the line by '=' to separate coordinates and value
                if (parts.length == 2) {
                    String[] coordinates = parts[0].split(","); // Split coordinates by comma
                    int x = Integer.parseInt(coordinates[0]);
                    if (x>width) {width=x;}
                    int y = Integer.parseInt(coordinates[1]);
                    if (y>height) {height=y;}
                    int value = Integer.parseInt(parts[1]);
                    switch (value){
                        case 0:numberofwall++;break;
                        case 1:numberofentry++;break;
                        case 2:numberofexit++;break;
                        case 3:numberoftraps++;break;
                        case 4:numberofenemies++;break;
                        case 5:numberofkeys++;break;
                    }
                    String coordinateKey = coordinates[0] + "," + coordinates[1];
                    coordinateMap.put(coordinateKey, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        width++;height++;
        System.out.println("Maps name: "+filePath.substring(filePath.length()-12));
        System.out.println("Width: "+width+", Height: "+height);
        System.out.println("Number of wall: "+numberofwall);
        System.out.println("Number of entry: "+numberofentry);
        System.out.println("Number of exit: "+numberofexit);
        System.out.println("Number of traps: "+numberoftraps);
        System.out.println("Number of enemies: "+numberofenemies);
        System.out.println("Number of keys: "+numberofkeys);

        System.out.println("-----------------**********------------------");

        filePath = "/Users/burakince/IdeaProjects/itp2324itp2324projectwork-thu2mu1burakidenizn/maps/level-5.properties"; // Replace this with the actual file path

        coordinateMap.clear();
        width = 0;
        height = 0;
        numberofwall=0;
        numberofenemies=0;
        numberoftraps=0;
        numberofkeys=0;
        numberofentry=0;
        numberofexit=0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("="); // Split the line by '=' to separate coordinates and value
                if (parts.length == 2) {
                    String[] coordinates = parts[0].split(","); // Split coordinates by comma
                    int x = Integer.parseInt(coordinates[0]);
                    if (x>width) {width=x;}
                    int y = Integer.parseInt(coordinates[1]);
                    if (y>height) {height=y;}
                    int value = Integer.parseInt(parts[1]);
                    switch (value){
                        case 0:numberofwall++;break;
                        case 1:numberofentry++;break;
                        case 2:numberofexit++;break;
                        case 3:numberoftraps++;break;
                        case 4:numberofenemies++;break;
                        case 5:numberofkeys++;break;
                    }
                    String coordinateKey = coordinates[0] + "," + coordinates[1];
                    coordinateMap.put(coordinateKey, value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        width++;height++;
        System.out.println("Maps name: "+filePath.substring(filePath.length()-12));
        System.out.println("Width: "+width+", Height: "+height);
        System.out.println("Number of wall: "+numberofwall);
        System.out.println("Number of entry: "+numberofentry);
        System.out.println("Number of exit: "+numberofexit);
        System.out.println("Number of traps: "+numberoftraps);
        System.out.println("Number of enemies: "+numberofenemies);
        System.out.println("Number of keys: "+numberofkeys);

    }
}
