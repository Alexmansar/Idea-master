package com.alexmansar.classwork.lesson6;

public class Sum {
    public static void main(String[] args) {
        int num1=1;
        int num2=2;
        double result = sum(num1,num2);
        System.out.println(result);
        System.out.println(sum(4,5));


        System.out.println(sum(2.0,2.5));
        System.out.println(sum(15L,400000L));

    }

    public static double sum (double a, double b){
        return a*b;
    }
    public static double sum (long a, long b){
        return a+b;
    }
    public static double sum (int a,int b){
        return a+b;
    }
}
