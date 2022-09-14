package com.alexmansar.homework.lesson7;

public class ExcludeNumber {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        for (int i = 0; i < 100; i++) {
            if ( i / 10 != a && i / 10 != b && i %10 != a && i %10 != b) {
                System.out.println("i= " + i);
                continue;

            }
        }
    }
}