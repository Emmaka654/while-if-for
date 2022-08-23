package com.belhard.lesson2.cycle;

import java.util.Scanner;

import static com.belhard.lesson2.branchin.Task1.input;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number: ");
        int num = input(scanner, 10);

        int result = 0;
        for (int i = 1; i <= num; i++){
            result += i;
        }

        System.out.println("Sum from 1 to "+ num +  " = " + result);
    }
}
