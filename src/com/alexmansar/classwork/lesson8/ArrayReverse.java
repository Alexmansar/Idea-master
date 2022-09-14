package com.alexmansar.classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverse {
    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("input 10 numbers");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(READER.readLine());
        }
        printArray(numbers);

    }

    public static void printArray(int[] numbers) {
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(i + " element: " + numbers[i]);
        }

    }
}
