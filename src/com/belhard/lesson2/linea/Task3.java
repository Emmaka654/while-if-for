package com.belhard.lesson2.linea;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputSec = input(scanner, 36754);

        int hours = findHours(inputSec);
        int minutes = findMinutes(inputSec);
        int seconds = findSeconds(inputSec);

        System.out.printf("%02dh %02dmin %02ds", hours, minutes, seconds);
    }

    private static int findSeconds(int inputSec) {
        return inputSec % 60;
    }

    private static int findMinutes(int inputSec) {
        return inputSec % 3600 / 60;
    }

    private static int findHours(int inputSec) {
        return inputSec / 3600;
    }

    private static int input(Scanner scanner, int defaultVal) {
        int inputSec;
        System.out.print("Please enter number: ");
        if (scanner.hasNextInt()) {
            inputSec = scanner.nextInt();
        } else {
            inputSec = 123456;
            System.out.println("You entered wrong symbol. Default value set: " + inputSec);
        }
        return inputSec;
    }
}
