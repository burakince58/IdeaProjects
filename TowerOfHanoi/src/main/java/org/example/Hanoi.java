package org.example;

import java.util.Scanner;


public class Hanoi {
    public static void move(int height, int a, int b) {
        if (height > 0) {
            int c = free(a, b);
            move(height - 1, a, c);
            System.out.println("move " + a + " to " + b);
            move(height - 1, c, b);
        }
    }

    public static int free(int a, int b) {
        return 6 - (a + b);
    }

    public static void main(String[] args) {
        int h = InputReader.readInt("Height of the tower: ");
        System.out.println("");
        move(h, 1, 3);
        System.out.println("");
    }
}

/*
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
*/