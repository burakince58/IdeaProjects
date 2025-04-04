import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(5>6?"Hello world!":"Good Bye World");
        System.out.println(5<6?"Hello world!":"Good Bye World");

        /*double radius = 7.0; // You can change this value to calculate the surface area for a sphere with a different radius.
        //calculateSphereSurfaceAreaAndDisplay(radius);

        int num1 = 10;
        int num2 = 5;
        int result = num1 / num2; // Breakpoint set on this line
        int twiceTheResult = result * 2;
        System.out.println("Twice the result is: " + twiceTheResult);

        int a = 3;
        int b = 20;
        int c = 5;
        int result2 = a + (b * c) / a - b / a;
        System.out.println(result2);

        int xs = -1;
        float x = 1.0f;
        System.out.println(x + xs);
        */

        Stack<Integer> stack = new Stack<>();
        stack.push(53);
        stack.push(23);
        stack.push(24);
        stack.push(42);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "; ");
        }


        Set<String> princesses = new HashSet<>();
        princesses.add("Snow White");
        princesses.add("Cinderella");
        princesses.add("Ariel");
        princesses.add("Cinderella");
        princesses.add("Aurora");
        for (String princess : princesses) {
            System.out.print(princess + "; ");
        }


        List<String> exampleList = new ArrayList<>();
        exampleList.add("This");
        exampleList.add("list");
        exampleList.add("has");
        exampleList.add("size");
        System.out.print(exampleList + " " + exampleList.size());
    }

    public static void calculateSphereSurfaceAreaAndDisplay(double radius) {

        //TODO: your code goes here
        int pi = 3;
        double surfaceArea = 4*pi*radius*radius;
        System.out.println("The surface area of the sphere is: " + surfaceArea);
    }

    public class Shape {
        protected String color;
        public double area() {
            double area = 0.0;
            // TODO: calculation of the area
            return area;
        }
    }
    public class Circle extends Shape {
        private final double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }
}