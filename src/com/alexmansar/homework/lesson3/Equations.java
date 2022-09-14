package com.alexmansar.homework.lesson3;

public class Equations {
public static void main(String[]args){
        float x=1.5f;
        float a=3*x;
        float b=1.5f*x;
        float c=2.2f*x;
        float y= (float) (Math.abs(a-b)/Math.pow((a+b),3)-Math.sqrt(c));
    System.out.println(y);
        }
}
