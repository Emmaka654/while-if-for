package com.belhard.lesson2.linea;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int T;
        System.out.print("Please enter number: ");
        if (scanner.hasNextInt()){
            T = scanner.nextInt();
        }
        else {
            T = 123456;
            String val = scanner.next();
            System.out.println("You entered wrong symbol. Default value set: " + T);
        }

        int hours = T / 3600;
        int minuts = T / 60 - hours * 60;
        int seconds = T - minuts * 60 - hours * 3600;

        System.out.println(hours + "h " + minuts + "min " + seconds + "s");
    }
}
