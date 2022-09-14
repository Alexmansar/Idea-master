package com.alexmansar.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int apple = getApple(READER);
        int bigJar = 5;
        int mediumJar = 3;
        int smallJar = 1;
        int big = findApple(apple, bigJar);
        int medium = findApple(getRemain(apple, big, bigJar), mediumJar);
        int small = findApple(getSmallJar(apple, big, bigJar, medium, mediumJar), smallJar);
        System.out.println("Big =" + big);
        System.out.println("Medium =" + medium);
        System.out.println("Small= " + small);
    }


    private static Integer getApple(BufferedReader READER) throws IOException {
        System.out.println("Enter the number of apples");
        return Integer.parseInt(READER.readLine());
    }

    public static int  findApple(int apples, int remain1) {
        return apples / remain1;
    }

    public static int getSmallJar(int apples, int remainForBig, int multiplicityBig, int remainForMedium, int multiplicityMedium) {
        return apples - (remainForBig * multiplicityBig) - (remainForMedium * multiplicityMedium);
    }

    public static int getRemain(int apples, int remain, int multiplicity) {
        return apples - (remain * multiplicity);
    }
}