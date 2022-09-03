package com.belhard.lesson2.branchin;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("max{min(a, b), min(c, d)}");
        System.out.print("Please enter a: ");
        int a = input(scanner, 10);
        System.out.print("Please enter b: ");
        int b = input(scanner, 6);
        System.out.print("Please enter c: ");
        int c = input(scanner, 17);
        System.out.print("Please enter d: ");
        int d = input(scanner, 100);

        int min1 = chooseMin(a, b);
        int min2 = chooseMin(c, d);
        int result = chooseMax(min1, min2);

        System.out.println("The result is " + result);
    }

    private static int chooseMax(int min1, int min2) {
        return min1 > min2 ? min1 : min2;
    }

    public static int input(Scanner scanner, int defaultVal) {
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            number = defaultVal;
            System.out.println("You entered wrong symbol. Default value set: " + number);
        }
        return number;
    }

    public static int chooseMin(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
