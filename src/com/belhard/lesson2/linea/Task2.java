package com.belhard.lesson2.linea;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = inputDouble(scanner, 123.456);

        double result = swapIntAndDecimalParts(number);

        System.out.println("Swap the integer and decimal parts of a number: " + result);
    }

    private static double swapIntAndDecimalParts(double number) {
        double result = (number * 1000) % 1000 + (int) number / 1000.0;
        return result;
    }

    private static double inputDouble(Scanner scanner, double defaultVal) {
        double number;
        System.out.print("Please enter number like nnn.ddd: ");
        if (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
        } else {
            number = defaultVal;
            System.out.println("You entered wrong symbol. Default value set: " + number);
        }
        return number;
    }


}
