package com.alexmansar.homework.lesson8;

import java.util.Arrays;

public class Password {
    public static void main(String[] args) {
        int firstNumber = 9;
        int secondNumber = 4;
        int thirdNumber = 0;
        int fourthNumber = 7;

        int[] password = {firstNumber, secondNumber, thirdNumber, fourthNumber};
        int count = 0;
        for (int k : password)
            for (int j = 0; j <= 9; j++) {
                count++;
                if (k == j) {
                    break;
                }
            }
        System.out.println("Number of iterations is " + count);


        int q1 = (int) ((Math.random()) * 10);
        int q2 = (int) ((Math.random()) * 10);
        int q3 = (int) ((Math.random()) * 10);
        int q4 = (int) ((Math.random()) * 10);
        int count2 = 0;
        int[] num = {q1, q2, q3, q4};
        System.out.println(Arrays.toString(num));
        for (int k : num)
            for (int j = 0; j <= 9; j++) {
                count2++;
                if (k == j) {
                    break;
                }
            }
        System.out.println("Number of iterations is " + count2);
    }
}