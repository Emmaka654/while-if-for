package com.belhard.lesson2.branchin;

import java.util.Scanner;

import static com.belhard.lesson2.branchin.Task1.input;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Function value calculation");
        System.out.print("Please enter number: ");
        int x = input(scanner, 10);

        double y = calculateFunction(x);

        System.out.println("Result = " + y);
    }

    private static double calculateFunction(int x) {
        double y;
        if (x > 3) {
            y = 1 / x * x * x + 6;
        } else {
            y = x * x - 3 * x + 9;
        }
        return y;
    }
}

