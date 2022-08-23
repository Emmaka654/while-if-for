package com.belhard.lesson2.cycle;

public class Task4 {
        public static void main(String[] args) {
            for (int i = 33; i < 128; i++) {
                char ch = (char) i;
                String tempOct = Integer.toOctalString(i);
                String tempHex = Integer.toHexString(i);
                System.out.println (i + " - " + ch);
            }
        }
    }