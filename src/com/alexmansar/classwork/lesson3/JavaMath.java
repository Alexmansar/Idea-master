package com.alexmansar.classwork.lesson3;

public class JavaMath {
    public static void main(String[] args) {

        System.out.println(Math.PI);

        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 8));
        float f1 = 45.87f;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(45.34));

        double random = Math.random();
        System.out.println("random " + random);
        int intRandom = (int) (random * 100);
        System.out.println(intRandom);
        int r = (int) (-50 + random * 100);
        System.out.println(r);
        int min = -50;
        int max = 50;
        int r3 = (int) (random * (max - min) + min);
        System.out.println(r3);
    }

}
