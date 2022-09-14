package com.alexmansar.classwork.lesson7;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
           System.out.println("i= " + i);
        }
        for (int i = 100; i >= 1; i=i-2) {
            System.out.println("i2=" + i);
        }
        for (int i = 0; i < 100; i++) {
            if (i%4==0||i%5==0){
                System.out.println(i);
            }
        }
        }
    }
