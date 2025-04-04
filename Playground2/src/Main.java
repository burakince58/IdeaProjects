
import java.util.*;

/*

public class Main {
    public static void main(String[] args) {
        Observable.fromArray(3, 4, 5, 6)
                .map(n -> 1 + n / 2)
                .filter(n -> n > 2) // Corrected the operator to '>'
                .reduce(Integer::sum)
                .subscribe(result -> System.out.println("Result: " + result));
    }
}


*/


/*
//What is the problem in the following code block?

public class Main {
    public static String getNumberName(int number) {
        String name = "";
        switch (number) {
            case 1: name = "one";
            case 2: name = "two";
            case 3: return "three";
            case 4: name = "four";
            case 5: name = "five";
            default: name = "unknown";
        }
        return name;
    }

    public static void main(String[] args) {
        System.out.print("x: ");
        for (int i = 1; i < 7; i += 3) {
            System.out.print(getNumberName(i) + ", ");
        }
    }
}
*/

/*

public class Main {

    public static String[] array = new String[]{"Hello", "World", "!", ";)"};
    public static void main(String[] args) {
        System.out.println("Array: "+concat(0));
    }

    public static String concat(int index) {
        if (index < array.length) {
            return "";
        } else {
            return array[index] + " " + concat(index + 1);
        }

    }
}


/*
public class Main {
    public static void main(String[] args) {
           course COURSE = new course(Intermediate);
           COURSE.Watch(5);
       }
}

     public class course {

       String level;
            int Amount_Of_Students;

         public course(String level, int amountOfStudents) {
             this.level = level;
             this.Amount_Of_Students = amountOfStudents;
         }

         public course(String level) {
             this.level = level;
             this.Amount_Of_Students = 0;
         }

         public course(int amountOfStudents) {
             this.level = Basic;
             this.amountOfStudents = amountOfStudents;
         }

         public course() {
             this.level = "Basic";
             this.Amount_Of_Students = 0;
         }

         public void Watch(int hours) {
             System.out.println("Watching...");
         }
 }


 */