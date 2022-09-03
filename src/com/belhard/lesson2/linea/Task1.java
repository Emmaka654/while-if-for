package com.belhard.lesson2.linea;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("z = ( (a - 3 ) * b / 2) + c");
        System.out.print("Please enter a: ");
        int a = input(scanner, 10);
        System.out.print("Please enter b: ");
        int b = input(scanner, 6);
        System.out.print("Please enter c: ");
        int c = input(scanner, 17);

        double z = findZ(a, b, c);

        System.out.println("The result is " + z);
    }

    private static double findZ(int a, int b, int c) {
        return ((a - 3) * b / 2.0) + c;
    }

    public static int input(Scanner scanner, int defaultVal) {
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            number = defaultVal;
            String val = scanner.next();
            System.out.println("You entered wrong symbol. Default value set: " + number);
        }
        return number;
    }

}
