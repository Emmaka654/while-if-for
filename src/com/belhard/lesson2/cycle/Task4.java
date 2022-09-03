package com.belhard.lesson2.cycle;

public class Task4 {
    public static void main(String[] args) {

        System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\tTable ASCII");

        printTableASCII();
    }

    private static void printTableASCII() {
        for (int i = 32; i <= 127; i++) {
            char ch = (char) i;
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(i + " - " + ch + "\t\t\t");
        }
    }
}