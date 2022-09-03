package com.belhard.lesson2.cycle;

import java.util.Scanner;

import static com.belhard.lesson2.branchin.Task1.input;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter start of segment: ");
        int startOfSegment = input(scanner, 10);
        System.out.print("Please enter end of segment: ");
        int endOfSegment = input(scanner, 20);
        System.out.print("Please enter step: ");
        int step = input(scanner, 4);

        int y = findY(startOfSegment, endOfSegment, step);

        System.out.println("Result = " + y);
    }

    private static int findY(int startOfSegment, int endOfSegment, int step) {
        int y = 0;
        for (int x = startOfSegment; x <= endOfSegment; x += step) {
            if (x > 2) {
                y = x + 4;
            } else {
                y = -x * 2;
            }
        }
        return y;
    }
}
