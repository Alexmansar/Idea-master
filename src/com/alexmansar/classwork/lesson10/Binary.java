package com.alexmansar.classwork.lesson10;

public class Binary {
    public static void main(String[] args) {
        int i=45;
        int u=56;

        System.out.println(i+" "+Integer.toBinaryString(i));
        int result=~i;
        System.out.println(result+" "+Integer.toBinaryString(result));
        System.out.println(u+" "+Integer.toBinaryString(u));
        int and = i&u;
        System.out.println(and+" "+Integer.toBinaryString(and));

        int or=i|u;
        System.out.println(or+" "+Integer.toBinaryString(or));

        int xor=i^u;
        System.out.println(xor+" "+Integer.toBinaryString(xor));
        int r=u &1;
        System.out.println(r);


    }
}
