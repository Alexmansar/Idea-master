package com.alexmansar.classwork.lesson7;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 52; i++) {
            if (i % 2 !=0) {
                continue;
            }
            System.out.println(i);
        }
    }
}