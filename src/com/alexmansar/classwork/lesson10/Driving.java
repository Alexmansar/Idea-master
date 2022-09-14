package com.alexmansar.classwork.lesson10;

public class Driving {
    public static void main(String[] args) {
        int i;
        int j;
        int a = 10;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
