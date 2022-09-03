package com.belhard.lesson2.cycle;

public class Task3 {
    public static void main(String[] args) {

        long result = sumOfSquaresFirstHundredNum();

        System.out.println("sum of squares of first 100 numbers = " + result);
    }

    private static long sumOfSquaresFirstHundredNum() {
        long result = 0;
        for (int i = 0; i < 101; i++) {
            result += i * i;
        }
        return result;
    }
}
