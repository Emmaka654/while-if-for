package com.belhard.lesson2.cycle;

import java.util.Scanner;

import static com.belhard.lesson2.branchin.Task1.input;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter start of segment: ");
        int a = input(scanner, 10);
        System.out.print("Please enter end of segment: ");
        int b = input(scanner, 20);
        System.out.print("Please enter step: ");
        int h = input(scanner, 4);

        int y = 0;
        for (int x = a; x <= b; x+= h){
            if (x > 2){
                y = x + 4;
            }
            else {
                y = -x * 2;
            }
        }

        System.out.println("Result = " + y);
    }
}
