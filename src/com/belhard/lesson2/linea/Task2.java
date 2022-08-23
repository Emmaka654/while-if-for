package com.belhard.lesson2.linea;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        double number;
        System.out.print("Please enter number like nnn.ddd: ");
        if (scanner.hasNextDouble()){
            number = scanner.nextDouble();
        }
        else {
            number = 123.456;
            String val = scanner.next();
            System.out.println("You entered wrong symbol. Default value set: " + number);
        }

        double result = (number * 1000) % 1000 + (int) number / 1000.0;

        System.out.println(result);
    }


//    public static double input(Scanner scanner, double defaultVal) {
//        double number;
//        if (scanner.toString().matches("^\\d{3}\\.\\d{3}$")){
//            number = scanner.nextDouble();
//        }
//        else {
//            number = defaultVal;
//            String val = scanner.next();
//            System.out.println("You entered wrong symbol. Default value set: " + number);
//        }
//        return number;
//    }
}
