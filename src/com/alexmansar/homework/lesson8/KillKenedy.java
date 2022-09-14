package com.alexmansar.homework.lesson8;

public class KillKenedy {
    public static void main(String[] args) {
        int[] numbers = {25, 4, 58, 54, 74, 84, 65, 15, 41, 9};
        int index = 0;
        int max = numbers[index];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
                index = i;
            }
        }
        System.out.println("Killer is " + index + " with probability " + max + " %");
    }
}
